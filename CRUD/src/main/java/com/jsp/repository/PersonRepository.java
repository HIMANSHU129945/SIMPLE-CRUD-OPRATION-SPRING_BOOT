package com.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	public List<Person> findByName(String name);

	public List<Person> findByAge(int age);

	public void deleteByAge(int age);

	
}
