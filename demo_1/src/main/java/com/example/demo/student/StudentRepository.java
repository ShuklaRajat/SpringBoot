package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository is for the Data Access Layer majorly i.e. helps to fetch the data from the database and sends this data
// to the Service layer.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
