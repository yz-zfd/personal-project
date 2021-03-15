package com.zfd.controller;

import com.zfd.exception.NullException;
import com.zfd.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "teacherController")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @RequestMapping(value = "/showTeacherAndStudentInfo")
    public String showTeacherAndStudentInfo(@RequestParam Integer status,@RequestParam String name){
        try {
            return teacherService.showTeacherInfo(status,name);
        } catch (NullException e) {
            return "获取教师信息失败";
        }
    }
}
