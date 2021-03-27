package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

// This class will have all the resources for our API.
@RestController
@RequestMapping(path = "api/v1/student")  // Now the values will be visible at localhost:8080/api/v1/student URL
public class StudentController {
    // We have to get something from our server, so use @GetMapping annotation. @RestController allows this class to be
    // exposed as a REST endpoint. And currently we have only one REST endpoint which is hello() which  returns
    // a hard coded student data in JSON format.
    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(new Student(
                1L,
                "Rajat",
                "rajat@springboot.com",
                LocalDate.of(1998, Month.JUNE, 16),
                23
        ));
    }
}
