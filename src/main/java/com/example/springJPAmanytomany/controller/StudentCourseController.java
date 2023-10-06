package com.example.springJPAmanytomany.controller;

import com.example.springJPAmanytomany.entity.Course;
import com.example.springJPAmanytomany.entity.Student;
import com.example.springJPAmanytomany.repository.CourseRepository;
import com.example.springJPAmanytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student/course")
@RestController
public class StudentCourseController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public Student saveStudentWithCourse(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/getALlStudents")
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/{StudentId}")
    public Student findByStudent(@PathVariable Long StudentId) {
        return studentRepository.findById(StudentId).orElse(null);
    }

    @GetMapping("/find/{name}")
    public List<Student> findContainingByName(@PathVariable String name) {
        return studentRepository.findByNameContaining(name);
    }

    @GetMapping("search/{fee}")
    public List<Course> findCourseLessThanPrice(@PathVariable double fee) {
        return courseRepository.findByFeeLessThan(fee);

    }


}
