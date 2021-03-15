package com.zfd.dao.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "teacher_info")
public class TeacherInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false,length = 20)
    protected Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "status")
    private Integer status;

    @Column(name = "phone")
    private String phone;
}
