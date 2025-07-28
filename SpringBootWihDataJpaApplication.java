package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entites.Student;
import com.example.services.StudentService;
import com.example.services.StudentServiceImplement;

@SpringBootApplication
public class SpringBootWihDataJpaApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWihDataJpaApplication.class, args);

		StudentService stdService = context.getBean(StudentServiceImplement.class);

		
		
		//	DELETE OPERATON
		
//		boolean status = stdService.deleteStdDetails(2L);
//		if(status)
//		{
//			System.out.println("Student details deleted successfully");
//		}
//		else
//		{
//			System.out.println("Student details not deleted due to some error");
//		}
		
		
		
		
		//	UPDATE OPERATION
		
		
//		Student std = stdService.getStdDetails(1L);
//		boolean status  = stdService.updateStdDetails(1L, 81.5f);
//		if(status)
//		{
//			System.out.println("Student details updated successfully !!! ");
//			
//			System.out.println("Id:" + std.getId());
//			System.out.println("Name : " + std.getName());
//			System.out.println("RollNo: " + std.getRollno());
//			System.out.println("Marks: " + std.getMarks()); 
//		}
//		else
//		{
//			System.out.println("Student details not updated due to some error");	
//		}
		
		
		
		
		
		//	GET STUDENT BY ID
		
		
//		Student std = stdService.getStdDetails(1L);
//		if(std != null)
//		{
//			System.out.println("Id:" + std.getId());
//			System.out.println("Name : " + std.getName());
//			System.out.println("RollNo: " + std.getRollno());
//			System.out.println("Marks: " + std.getMarks());
//		}
//		else
//		{
//			System.out.println("Student not found !!! ");
//		}
		
		
		
		
		
		
		
		
		//	GET ALL STUDENT
		
		
//		List<Student> stdList = stdService.getAllStdDetails();
//		for(Student std : stdList)
//		{
//			
//			
//			System.out.println("Id:" + std.getId());
//			System.out.println("Name : " + std.getName());
//			System.out.println("RollNo: " + std.getRollno());
//			System.out.println("Marks: " + std.getMarks());
//			
//			System.out.println("----------------------------------------");
//		}
		
		
		
		
		
		
		//	ADD NEW STUDENT
		
		
//		Student std = new Student();
//		std.setName("Siam");
//		std.setRollno(107);
//		std.setMarks(98.78f);
//
//		boolean status = stdService.addStudentDetails(std);
//
//		if (status) {
//			System.out.println("Student inserted successfully");
//		} else {
//			System.out.println("Student not inserted due to some error");
//		}
		
		
		
		
	}
}
