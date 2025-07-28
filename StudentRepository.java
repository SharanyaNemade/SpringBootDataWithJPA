package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entites.Student;



//This is the main line:

//You’re creating a custom repository interface named StudentRepository.
//It extends JpaRepository<Student, Long>, which means:
//Student: The Entity class you're managing.
//Long: The type of the primary key (i.e., the id in Student class).
//-This one line gives you full CRUD capabilities for the student table — without writing any SQL.



//	A custom repository interface (StudentRepository in this case) in Spring Data JPA allows us to define additional query methods or business logic beyond the standard CRUD operations.
//	It extends "JpaRepository" and provides a way to implement complex or specialized database operations.


public interface StudentRepository extends JpaRepository<Student, Long>
{	
	
	
}
