package com.example.demo.student;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//API always deal with controller class

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/{id}")
    public List<Student> getStudent(){
       return studentService.getStudent();
    }
}
