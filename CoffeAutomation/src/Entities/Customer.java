package Entities;
import java.time.LocalDate;
import java.util.Date;

import Interfaces.Entity;

public class Customer implements Entity {

	
	private int Id;
	private String Firstname;
	private String Lastname;
	private LocalDate DateOftBirth;
	private String NationalityId;

	
	public Customer(int id, String firstname, String lastname, LocalDate dateOftBirth, String nationalityId) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		DateOftBirth = dateOftBirth;
		NationalityId = nationalityId;
	}
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		this.Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		this.Lastname = lastname;
	}

	public LocalDate getDateOftBirth() {
		return DateOftBirth;
	}

	public void setDateOftBirth(LocalDate dateOftBirth) {
		this.DateOftBirth = dateOftBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.NationalityId = nationalityId;
	}
	
		
}
