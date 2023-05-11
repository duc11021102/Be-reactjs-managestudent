package com.example.restful_api.repository;

import com.example.restful_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
    Student save(Student student);
    void delete(Student student);
}
