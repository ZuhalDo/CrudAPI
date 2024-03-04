package com.example.CrudAPI.repository;

import com.example.CrudAPI.model.Student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByAccountNo(Long accountNo);
    List<Student> findByNameContaining(String name);
}
