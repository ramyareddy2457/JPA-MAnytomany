package com.example.springJPAmanytomany.repository;

import com.example.springJPAmanytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByNameContaining(String name);
}
