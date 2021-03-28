package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
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

    private final StudentServices studentServices;

    //@Autowired is used for dependency injection. It basically states that studentServices need to be instantiated.
    // We could infact use : this.studentServices = new StudentServices(); but we should try using dependency injection
    // as much as possible rather than instantiation as shown above as part of good coding practice. In such instances
    // we also should StudentServices class know that it should be automatically instantiated for that we use @Component
    // or @Service. In our case, we will use @Service, for semantics point of view.
    @Autowired
    public StudentController(StudentServices studentServices){
        this.studentServices = studentServices;
    }

    // We have to get something from our server, so use @GetMapping annotation. @RestController allows this class to be
    // exposed as a REST endpoint. And currently we have only one REST endpoint which is hello() which  returns
    // a hard coded student data in JSON format.
    @GetMapping
    public List<Student> getStudents() {
        return studentServices.getStudents();
    }
}
