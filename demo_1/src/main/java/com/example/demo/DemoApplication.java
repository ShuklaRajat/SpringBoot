package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

   // We have to get something from our server, so use @GetMapping annotation. @RestController allows this class to be
   // exposed as a REST endpoint. And currently we have only one REST endpoint which is hello() which  returns
   // "Hello World".
   @GetMapping
	public List<Student> hello() {
		return Arrays.asList(new Student(
				1L,
				"Rajat",
				"rajat@springboot.com",
				LocalDate.of(1998, Month.JUNE, 16),
				23
		));
	}
}
