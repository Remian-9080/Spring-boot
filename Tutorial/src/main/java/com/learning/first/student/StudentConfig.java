package com.learning.first.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository)
    {
return args ->
{
    
			Student rakib= new Student(
		    "Rakib",
            "rakibpsp@gmail.com",
		    LocalDate.of(1999,11 ,06 )
		    
		);
        Student alex=new Student(
		"Alex",
            "rakibpsp@gmail.com",
		    LocalDate.of(2000,1 ,06 )
		   
		);
        repository.saveAll(List.of(rakib,alex));
    
}; 
    }
}
