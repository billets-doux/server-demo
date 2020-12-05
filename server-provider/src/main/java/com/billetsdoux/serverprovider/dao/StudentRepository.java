package com.billetsdoux.serverprovider.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.billetsdoux.servercommon.dto.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentRepository extends BaseMapper<Student> {

}
