package com.sprint.boot.apirest.persons.services;

import java.util.List;

import com.sprint.boot.apirest.persons.entity.Persona;

public interface IPersonaServices {
	public List<Persona> findAll();
	public Persona save(Persona persona);
	public Persona findById(Long Id);
	public void delete(Long Id);
}
