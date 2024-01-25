package com.learning.first;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.first.student.Student;

@SpringBootApplication
@RestController 
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	 }
	 
	 @GetMapping 
	 public List<Student> hello()
	 {
		
		return List.of(
			new Student(
			1L,"Rakib","rakibpsp@gmail.com",
		    LocalDate.of(1999,11 ,06 ),
		    24
		));
	 }
 
}
