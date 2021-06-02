package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service  //to instantiate
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Rohit",21,
                        LocalDate.of(2000, Month.JANUARY,5),"p.rohit2018@vitstudent.ac.in" )
        );
    }
}
