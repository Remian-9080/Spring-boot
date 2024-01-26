package com.learning.first.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class StudentService 
{
    public List<Student> getStudents()
	 {
		
		return List.of(
			new Student(
			1L,"Rakib","rakibpsp@gmail.com",
		    LocalDate.of(1999,11 ,06 ),
		    24
		));
	 }
}
