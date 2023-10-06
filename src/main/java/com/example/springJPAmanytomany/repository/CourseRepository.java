package com.example.springJPAmanytomany.repository;

import com.example.springJPAmanytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> findByFeeLessThan(double fee);

}
