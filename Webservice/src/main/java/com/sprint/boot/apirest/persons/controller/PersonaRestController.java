package com.sprint.boot.apirest.persons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.boot.apirest.persons.entity.Persona;
import com.sprint.boot.apirest.persons.services.IPersonaServices;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

	@Autowired
	private IPersonaServices personaServices;

	@GetMapping("/persona")
	public List<Persona> index(){
		return personaServices.findAll();
	}
	@PostMapping("/persona")
	public Persona create(@RequestBody Persona persona){
		return personaServices.save(persona);
	}
	@PostMapping("/persona/{Id}")
	public Persona show(@PathVariable Long Id){
		return personaServices.findById(Id);
	}
	@DeleteMapping("/persona/{Id}")
	public void delete(@PathVariable Long Id){
		personaServices.delete(Id);
	}
	@PutMapping("/persona/{Id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@PathVariable Long Id, @RequestBody Persona persona){
		Persona personaActual=personaServices.findById(Id);
		personaActual.setName(persona.getName());
		personaActual.setLastname(persona.getLastname());
		personaActual.setEmail(persona.getEmail());
		
		return personaServices.save(personaActual);
		
	}
}
