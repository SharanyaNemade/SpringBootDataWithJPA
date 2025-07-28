package com.example.services;

import java.util.List;

import com.example.entites.Student;

public interface StudentService
{
	
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStdDetails();
	
	public Student getStdDetails(long id);
	
	public boolean updateStdDetails(long id, float marks);
	
	public boolean deleteStdDetails(long id);
}
