package com.billetsdoux.serverprovider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.billetsdoux.servercommon.dto.Student;
import com.billetsdoux.servercommon.service.StudentService;
import com.billetsdoux.serverprovider.dao.StudentRepository;
import org.apache.dubbo.config.annotation.Service;

import java.io.Serializable;
import java.util.List;

@Service()
public class StudentServiceImpl extends ServiceImpl<StudentRepository,Student> implements StudentService {
    @Override
    public Student getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<Student> list() {
        return super.list();
    }

    @Override
    public boolean save(Student entity) {
        return super.save(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }
}
