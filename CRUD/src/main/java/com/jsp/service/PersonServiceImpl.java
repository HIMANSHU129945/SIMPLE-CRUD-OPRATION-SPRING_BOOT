package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.entity.Person;
import com.jsp.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	public PersonRepository repo;
	
	// Save Person
	@Override
	public Person savePerson(Person person) {
		return repo.save(person);
	}


	// Find All
	@Override
	public List<Person> findAll() {
		return repo.findAll();
	}


	// Find By Id
	@Override
	public Person findById(int id) {
		return repo.findById(id).orElse(null);
	}

	// Find By Name
	@Override
	public List<Person> findByName(String name) {
		return repo.findByName(name);
	}

    //Find By Age
	@Override
	public List<Person> findByAge(int age) {
		// TODO Auto-generated method stub
		return repo.findByAge(age);
	}

    
	// Delete By Id
	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	// Update person
	@Override
	public Person updatePerson(Person person) {
		Person oldPerson=repo.findById(person.getId()).orElse(null);
		oldPerson.setName(person.getName());
		oldPerson.setAge(person.getAge());
		oldPerson.setPhno(person.getPhno());
		oldPerson.setAddress(person.getAddress());
		return repo.save(oldPerson);
	}


}
