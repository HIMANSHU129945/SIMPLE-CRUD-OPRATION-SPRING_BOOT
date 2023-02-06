package com.jsp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.entity.Person;

@Service
public interface PersonService{
	
	public Person savePerson(Person person);
	
	public List<Person> findAll();
	
	public Person findById(int id);
	
	public List<Person> findByName(String name);
	
	public List<Person> findByAge(int age);
	
	public void deleteById(int id);
	
	public Person updatePerson(Person person);
 	

	
}
