package com.zfd.dao;

import com.zfd.dao.domain.TeacherInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherInfoRepository extends JpaRepository<TeacherInfo,Long> {
    List<TeacherInfo> findByStatus(Integer Status);
}
