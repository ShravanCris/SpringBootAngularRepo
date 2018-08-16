package com.javasampleapproach.jpapostgresqlangular4.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.jpapostgresqlangular4.model.Concession;

public interface ConcessionRepository extends CrudRepository<Concession, Long>{

	List<Concession> findByIssuingStation(String issuingStation);

	

}
