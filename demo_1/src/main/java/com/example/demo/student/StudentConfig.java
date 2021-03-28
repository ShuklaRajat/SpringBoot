package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student rajat = new Student(
                    1L,
                    "Rajat",
                    "rajat@springboot.com",
                    LocalDate.of(1998, JUNE, 16),
                    23);

            Student sunny = new Student(
                    1L,
                    "Sunny",
                    "sunny@springboot.com",
                    LocalDate.of(1990, JULY, 15),
                    23);

            studentRepository.saveAll(Arrays.asList(rajat, sunny));
        };
    }
}
