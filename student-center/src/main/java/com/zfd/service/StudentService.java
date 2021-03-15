package com.zfd.service;

import com.zfd.dao.StudentInfoRepository;
import com.zfd.service.dto.StudentInfoDto;
import com.zfd.service.mapper.StudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    StudentInfoRepository studentInfoRepository;
    public List<StudentInfoDto> findStudent(String name){
        List<StudentInfoDto> dtos = studentInfoRepository.findByName(name)
                .stream()
                .map(StudentInfoMapper.INSTANCE::map)
                .collect(Collectors.toList());
        return dtos;
    }
}
