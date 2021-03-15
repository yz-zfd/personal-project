package com.zfd.service.mapper;

import com.zfd.dao.domain.StudentInfo;
import com.zfd.service.dto.StudentInfoDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhangfada
 * @date 2020/7/23
 */
@Mapper
public interface StudentInfoMapper {
    StudentInfoMapper INSTANCE = Mappers.getMapper(StudentInfoMapper.class);
    @Mappings({})
    StudentInfoDto map(StudentInfo entity);

    @Mappings({})
    @IterableMapping(qualifiedBy = Simple.class)
    List<StudentInfoDto> map(List<StudentInfo> list);

    @Mappings({})
    StudentInfo from(StudentInfoDto dto);

    @Mappings({})
    @IterableMapping(qualifiedBy = Simple.class)
    List<StudentInfo> from(List<StudentInfoDto> list);

    /**
     * 基本也就只有更新 entity 的情况
     *
     * @param source pojo
     * @param target target会被更新，忽略 null
     * @return entity
     * */

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    StudentInfo update(@MappingTarget StudentInfo target, StudentInfoDto source);
}