package com.sprint.boot.apirest.persons.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprint.boot.apirest.persons.entity.Persona;
import com.sprint.boot.apirest.persons.models.DAO.IPersonaDAO;

@Service
public class PersonaServicesImpl implements IPersonaServices{
	
	@Autowired
	private IPersonaDAO personaDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDAO.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		return personaDAO.save(persona);
	}

	@Override
	public Persona findById(Long Id) {
		return personaDAO.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		 personaDAO.deleteById(Id);
	}
	
	
}
