package com.example.mergiterog.controller;


import com.example.mergiterog.bean.Student;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(1, "Andrei", "Moiceanu");
        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Andrei", "Moiceanu"));
        students.add(new Student(2, "Larisa", "Sandu"));
        students.add(new Student(3, "Maria", "Eremia"));
        return students;
    }

    @GetMapping("students/{id}/{fisrt-nam}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int id,
                                       @PathVariable("fisrt-name")String fisrtName,
                                       @PathVariable("last-name")String lastName){
        return new Student(id, fisrtName, lastName);
    }
}
