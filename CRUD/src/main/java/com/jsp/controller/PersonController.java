package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.jsp.entity.Person;
import com.jsp.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	public PersonService personService;
	
	// Add Person
	@PostMapping("addPerson")
	public Person savePerson(@RequestBody Person p) {
		return personService.savePerson(p);
	}
	
	//  Get All Person
	@GetMapping("GetAllPerson")
	public List<Person> getAllPerson(){
		return personService.findAll();
	}
	
	// Get Person By Id
	@GetMapping("getPersonById/{id}")
	public Person getById(@PathVariable int id) {
		return personService.findById(id);
	}
	
	// Get Person By Name
	@GetMapping("getPersonByName/{name}")
	public List<Person> getByName(@PathVariable String name){
		return personService.findByName(name);
	}
	
	// Get Person By Name
	@GetMapping("getPersonByAge/{age}")
	public List<Person> getByAge(@PathVariable int age){
		return personService.findByAge(age);
	}
	
	// Delete Person By Id
	@DeleteMapping("deleteById/{id}")
	public void deletePersonByID(@PathVariable int id) {
		personService.deleteById(id);
	}

	// Update Person
	@PutMapping("update")
	public Person updatePerson(@RequestBody Person P) {
		return personService.updatePerson(P);
	}

}
