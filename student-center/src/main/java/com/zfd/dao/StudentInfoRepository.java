package com.zfd.dao;

import com.zfd.dao.domain.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Long> {
    List<StudentInfo> findByName(String name);
}
