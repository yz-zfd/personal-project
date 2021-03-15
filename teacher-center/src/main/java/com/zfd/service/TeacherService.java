package com.zfd.service;

import com.zfd.client.StudentControllerClient;
import com.zfd.dao.TeacherInfoRepository;
import com.zfd.exception.NullException;
import com.zfd.service.dto.TeacherInfoDto;
import com.zfd.service.mapper.TeacherInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherService {
    @Autowired
    TeacherInfoRepository teacherInfoRepository;
    @Autowired
    StudentControllerClient studentControllerClient;

    public String showTeacherInfo(Integer status,String name) throws NullException {
        String stuName = studentControllerClient.findDelayProduct(name);
        return Optional.ofNullable(teacherInfoRepository.findByStatus(status))
                .orElseThrow(() -> new NullException())
                .stream()
                .map(TeacherInfoMapper.INSTANCE::map)
                .map(TeacherInfoDto::getName)
                .collect(Collectors.joining())+" 学生："+stuName;
    }

}
