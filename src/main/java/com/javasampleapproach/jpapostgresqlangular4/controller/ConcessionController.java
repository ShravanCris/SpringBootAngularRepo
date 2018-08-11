package com.javasampleapproach.jpapostgresqlangular4.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jpapostgresqlangular4.model.Concession;
//import com.javasampleapproach.jpapostgresqlangular4.model.Concession;
import com.javasampleapproach.jpapostgresqlangular4.repo.ConcessionRepository;

@RestController
public class ConcessionController {

	@Autowired
	ConcessionRepository repository;
	
	@GetMapping(value="/concession",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Concession> getAll() {
		List<Concession> list = new ArrayList<>();
		Iterable<Concession> concession = repository.findAll();

		concession.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/postconcession")
	public Concession postConcession(@RequestBody Concession concession) {

		/*repository.save(new Concession(concession.getCard_S_no(),concession.getIssuingZone(),concession.getValidfrom(),
				concession.getValidtill(),concession.getReg_no(),concession.getHospital(),concession.getJS_agency(),
				concession.getCC_DOB(),concession.getJS_DOB(),concession.getFirstname(),concession.getH_address(),
				concession.getConc_type(),concession.getAadhar(),concession.getNationality(),concession.getCC_Age(),
				concession.getGender(),concession.getJS_Aadhar(),concession.getH_gender(),concession.getDoc_name(),
				concession.getJS_gender(),concession.getH_name(),concession.getCard_type(),concession.getNature_of_handicap(),
				concession.getJS_Designation(),concession.getJS_Spouse_name(),concession.getJS_issuing_auth(),concession.getJS_issuing_station(),
				concession.getH_certi_number()));
		*/
		 repository.save(new Concession(concession.getCard_S_no(),concession.getIssuingZone(),concession.getIssuingStation(),concession.getValidtill(),
				 concession.getFirstname(),concession.getGender(),concession.getCC_DOB(),concession.getCC_Age(),concession.getNationality(),concession.getAadhar(),
				 concession.getCard_type(),concession.getJS_Spouse_name(),concession.getJS_gender(),concession.getJS_DOB(),concession.getJS_Aadhar(),concession.getJS_issuing_auth(),
				 concession.getJS_issuing_station(),concession.getJS_agency(),concession.getJS_Designation(),concession.getH_name(),concession.getH_gender(),
				 concession.getH_certi_number(),concession.getH_address(),concession.getConc_type(),concession.getNature_of_handicap(),concession.getDoc_name(),
				 concession.getReg_no(),concession.getHospital(),concession.getValidfrom()));
		 
		return concession;
	}

    @GetMapping(value="/findbyissuingStation/{issuingStation}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Concession> findByfindByIssuingStation(@PathVariable String issuingStation) {

		List<Concession> concession = repository.findByIssuingStation(issuingStation);
		return concession;
	}
	
	@DeleteMapping(value="/concession/{id}")
	public void deleteConcession(@PathVariable long id){
		
		repository.delete(id);
	}
	
}
