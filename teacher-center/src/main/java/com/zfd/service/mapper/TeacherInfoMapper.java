package com.zfd.service.mapper;

import com.zfd.dao.domain.TeacherInfo;
import com.zfd.service.dto.TeacherInfoDto;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TeacherInfoMapper {
    TeacherInfoMapper INSTANCE = Mappers.getMapper(TeacherInfoMapper.class);
    @Mappings({})
    TeacherInfoDto map(TeacherInfo entity);

    @Mappings({})
    TeacherInfo from(TeacherInfoDto dto);
}
