package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public String hello() {
		return "Hello World";
	}
}
