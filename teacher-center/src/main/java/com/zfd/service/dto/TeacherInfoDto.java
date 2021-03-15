package com.zfd.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class TeacherInfoDto {

    private String code;

    private String name;

    private String age;

    private Integer status;

    private String phone;
}
