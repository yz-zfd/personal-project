package com.zfd.controller;

import com.zfd.service.StudentService;
import com.zfd.service.dto.StudentInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("studentController")
@Slf4j
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("findDelayProduct")
    public String findDelayProduct(@RequestParam("name") String name){
        List<StudentInfoDto> studentList = studentService.findStudent(name);
        System.out.println(studentList.toString());
        return studentList.stream().map(StudentInfoDto::getName).collect(Collectors.joining(" "));
    }
}
