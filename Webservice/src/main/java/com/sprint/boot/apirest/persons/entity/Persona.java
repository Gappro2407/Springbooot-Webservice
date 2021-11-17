package com.sprint.boot.apirest.persons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicio")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idp;
	private String name;
	private String lastname;
	private String email;
	
	
	
	public Long getIdp() {
		return idp;
	}
	public void setIdp(Long idp) {
		this.idp = idp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
