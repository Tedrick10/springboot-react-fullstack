package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> studentList = Arrays.asList(
                new Student(1L, "Thet Tun Kyaw", "thettunkyaw.personal@gmail.com", Gender.MALE),
                new Student(2L, "Zin Min Oo", "zinminoo.personal@gmail.com", Gender.MALE),
                new Student(3L, "La Won Shan", "lawonshan.personal@gmail.com", Gender.FEMALE),
                new Student(4L, "Thaw Zin Phyo", "thawzinphyo.personal@gmail.com", Gender.MALE),
                new Student(5L, "Phyo Thiri Shan", "phyothirishan.personal@gmail.com", Gender.FEMALE),
                new Student(6L, "Bhone Pyae Shan", "bhonepyaeshan.personal@gmail.com", Gender.MALE)
        );

        return studentList;
    }
}
