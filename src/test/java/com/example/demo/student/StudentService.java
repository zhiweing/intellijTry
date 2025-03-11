package com.example.demo.student;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(new Student(1,"Marry","Lily","marry@gmail.com", "12345", LocalDate.of(2003, Month.APRIL,5),"F"));
    }

}
