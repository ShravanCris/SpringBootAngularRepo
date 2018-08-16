package com.javasampleapproach.jpapostgresqlangular4.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "concession")
public class Concession implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="Card_S_No")
	private long card_S_no;



	@Column(name = "issuingZone")
	private String issuingZone;

	@Column(name = "issuingStation")
	private String issuingStation;
	
	@Column(name="VALID_TILL")
	private Date validtill;
	
	@Column(name="FIRST_NAME")
	private String Firstname;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="CC_DOB")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date CC_DOB;
	
	@Column(name="CC_AGE")
	private Number CC_Age;
	
	@Column(name="NATIONALITY")
	private String Nationality;
	
	@Column(name="AADHAR_NO")
	private Number Aadhar;
	
	@Column(name="CARD_TYPE")
	private String Card_type;
	
	@Column(name="JS_SPOUSE_NAME")
	private String JS_Spouse_name;
	
	@Column(name="JS_GENDER")
	private String JS_gender;
	
	@Column(name="JS_DOB")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date JS_DOB;
	
	@Column(name="JS_AADHAR_NO")
	private Number JS_Aadhar;
	
	@Column(name="JS_ISSUING_AUTH")
	private String JS_issuing_auth;
	
	@Column(name="JS_ISSUING_STATION")
	private String JS_issuing_station;
	
	@Column(name="JS_AGENCY")
	private String JS_agency;
	
	@Column(name="JS_DESIGNATION")
	private String JS_Designation;
	
	public String getJS_Designation() {
		return JS_Designation;
	}

	public void setJS_Designation(String jS_Designation) {
		JS_Designation = jS_Designation;
	}

	public String getJS_agency() {
		return JS_agency;
	}

	public void setJS_agency(String jS_agency) {
		JS_agency = jS_agency;
	}

	@Column(name="HANDICAPPED_NAME")
	private String H_name;
	
	@Column(name="HANDICAP_GENDER")
	private String H_gender;
	
	@Column(name="H_CERTI_NUMBER")
	private String H_certi_number;
	
	@Column(name="H_ADDRESS")
	private String H_address;
	
	@Column(name="CONC_TYPE")
	private String Conc_type;
	
	@Column(name="NATURE_OF_HANDICAP")
	private String Nature_of_handicap;
	
	@Column(name="DOC_NAME")
	private String Doc_name;
	
	@Column(name="REG_NO")
	private String reg_no;
	
	@Column(name="HOSPITAL")
	private String hospital;

	@Column(name="VALID_FROM")
	private Date validfrom;
	public Date getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}

	public Date getValidtill() {
		return validtill;
	}

	public void setValidtill(Date validtill) {
		this.validtill = validtill;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getCC_DOB() {
		return CC_DOB;
	}

	public void setCC_DOB(Date cC_DOB) {
		CC_DOB = cC_DOB;
	}

	public Number getCC_Age() {
		return CC_Age;
	}

	public void setCC_Age(Number cC_Age) {
		CC_Age = cC_Age;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public Number getAadhar() {
		return Aadhar;
	}

	public void setAadhar(Number aadhar) {
		Aadhar = aadhar;
	}

	public String getCard_type() {
		return Card_type;
	}

	public void setCard_type(String card_type) {
		Card_type = card_type;
	}

	public String getJS_Spouse_name() {
		return JS_Spouse_name;
	}

	public void setJS_Spouse_name(String jS_Spouse_name) {
		JS_Spouse_name = jS_Spouse_name;
	}

	public String getJS_gender() {
		return JS_gender;
	}

	public void setJS_gender(String jS_gender) {
		JS_gender = jS_gender;
	}

	public Date getJS_DOB() {
		return JS_DOB;
	}

	public void setJS_DOB(Date jS_DOB) {
		JS_DOB = jS_DOB;
	}

	public Number getJS_Aadhar() {
		return JS_Aadhar;
	}

	public void setJS_Aadhar(Number jS_Aadhar) {
		JS_Aadhar = jS_Aadhar;
	}

	public String getJS_issuing_auth() {
		return JS_issuing_auth;
	}

	public void setJS_issuing_auth(String jS_issuing_auth) {
		JS_issuing_auth = jS_issuing_auth;
	}

	public String getJS_issuing_station() {
		return JS_issuing_station;
	}

	public void setJS_issuing_station(String jS_issuing_station) {
		JS_issuing_station = jS_issuing_station;
	}

	public String getH_name() {
		return H_name;
	}

	public void setH_name(String h_name) {
		H_name = h_name;
	}

	public String getH_gender() {
		return H_gender;
	}

	public void setH_gender(String h_gender) {
		H_gender = h_gender;
	}

	public String getH_certi_number() {
		return H_certi_number;
	}

	public void setH_certi_number(String h_certi_number) {
		H_certi_number = h_certi_number;
	}

	public String getH_address() {
		return H_address;
	}

	public void setH_address(String h_address) {
		H_address = h_address;
	}

	public String getConc_type() {
		return Conc_type;
	}

	public void setConc_type(String conc_type) {
		Conc_type = conc_type;
	}

	public String getNature_of_handicap() {
		return Nature_of_handicap;
	}

	public void setNature_of_handicap(String nature_of_handicap) {
		Nature_of_handicap = nature_of_handicap;
	}

	public String getDoc_name() {
		return Doc_name;
	}

	public void setDoc_name(String doc_name) {
		Doc_name = doc_name;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
	
	protected Concession() {
	}

	public long getCard_S_no() {
		return card_S_no;
	}

	public void setCard_S_no(long card_S_no) {
		this.card_S_no = card_S_no;
	}

	public String getIssuingZone() {
		return issuingZone;
	}

	public void setIssuingZone(String issuingZone) {
		this.issuingZone = issuingZone;
	}

	public String getIssuingStation() {
		return issuingStation;
	}

	public void setIssuingStation(String issuingStation) {
		this.issuingStation = issuingStation;
	}

	@Override
	public String toString() {
		return "Concession [card_S_no=" + card_S_no + ", issuingZone=" + issuingZone + ", issuingStation="
				+ issuingStation + ", validtill=" + validtill + ", Firstname=" + Firstname + ", Gender=" + Gender
				+ ", CC_DOB=" + CC_DOB + ", CC_Age=" + CC_Age + ", Nationality=" + Nationality + ", Aadhar=" + Aadhar
				+ ", Card_type=" + Card_type + ", JS_Spouse_name=" + JS_Spouse_name + ", JS_gender=" + JS_gender
				+ ", JS_DOB=" + JS_DOB + ", JS_Aadhar=" + JS_Aadhar + ", JS_issuing_auth=" + JS_issuing_auth
				+ ", JS_issuing_station=" + JS_issuing_station + ", JS_agency=" + JS_agency + ", JS_Designation="
				+ JS_Designation + ", H_name=" + H_name + ", H_gender=" + H_gender + ", H_certi_number="
				+ H_certi_number + ", H_address=" + H_address + ", Conc_type=" + Conc_type + ", Nature_of_handicap="
				+ Nature_of_handicap + ", Doc_name=" + Doc_name + ", reg_no=" + reg_no + ", hospital=" + hospital
				+ ", validfrom=" + validfrom + "]";
	}

	public Concession(long card_S_no, String issuingZone, String issuingStation, Date validtill, String firstname,
			String gender, Date cC_DOB, Number cC_Age, String nationality, Number aadhar, String card_type,
			String jS_Spouse_name, String jS_gender, Date jS_DOB, Number jS_Aadhar, String jS_issuing_auth,
			String jS_issuing_station, String jS_agency, String jS_Designation, String h_name, String h_gender,
			String h_certi_number, String h_address, String conc_type, String nature_of_handicap, String doc_name,
			String reg_no, String hospital, Date validfrom) {
		
		this.card_S_no = card_S_no;
		this.issuingZone = issuingZone;
		this.issuingStation = issuingStation;
		this.validtill = validtill;
		this.Firstname = firstname;
		this.Gender = gender;
		this.CC_DOB = cC_DOB;
		this.CC_Age = cC_Age;
		this.Nationality = nationality;
		this.Aadhar = aadhar;
		this.Card_type = card_type;
		this.JS_Spouse_name = jS_Spouse_name;
		this.JS_gender = jS_gender;
		this.JS_DOB = jS_DOB;
		this.JS_Aadhar = jS_Aadhar;
		this.JS_issuing_auth = jS_issuing_auth;
		this.JS_issuing_station = jS_issuing_station;
		this.JS_agency = jS_agency;
		this.JS_Designation = jS_Designation;
		this.H_name = h_name;
		this.H_gender = h_gender;
		this.H_certi_number = h_certi_number;
		this.H_address = h_address;
		this.Conc_type = conc_type;
		this.Nature_of_handicap = nature_of_handicap;
		this.Doc_name = doc_name;
		this.reg_no = reg_no;
		this.hospital = hospital;
		this.validfrom = validfrom;
	}

	
	
}
