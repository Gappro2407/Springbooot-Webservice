package com.sprint.boot.apirest.persons.models.DAO;

import org.springframework.data.repository.CrudRepository;

import com.sprint.boot.apirest.persons.entity.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Long>{
	
}
