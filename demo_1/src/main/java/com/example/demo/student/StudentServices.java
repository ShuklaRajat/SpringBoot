package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServices {
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
