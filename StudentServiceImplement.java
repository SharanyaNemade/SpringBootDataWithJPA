package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entites.Student;
import com.example.repositories.StudentRepository;





//StudentRepository studentRepository; is how your service class talks to the DB via Spring Data JPA.
//It acts like a bridge between your logic (in Service) and the database (via Repository).
//But unless you inject it (@Autowired), it's just a null reference.



@Service
public class StudentServiceImplement implements StudentService
{
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public boolean addStudentDetails(Student std)
	{
		boolean status = false;
		
		try
		{
			studentRepository.save(std);		//	METHOD OF JPA REPOSITORY
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	
	

	@Override
	public List<Student> getAllStdDetails()
	{
		return studentRepository.findAll();
	}




	@Override
	public Student getStdDetails(long id)
	{
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		
		else
		{
			return null;
		}
	}




	@Override
	public boolean updateStdDetails(long id, float marks)
	{
		Student std = getStdDetails(id); 
		if(std != null)
		{
			std.setMarks(marks);
			studentRepository.save(std);
			
			return true;
		}	
		return false;
	}




	@Override
	public boolean deleteStdDetails(long id)
	{
		boolean status = false;
		try
		{
			studentRepository.deleteById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status = false;
		}
		return status;
	}

}
