package com.billetsdoux.serverconsumer.controller;

import com.billetsdoux.servercommon.dto.Student;
import com.billetsdoux.servercommon.service.StudentService;
import com.billetsdoux.servercommon.vo.ResultVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Reference
    private StudentService service;

    @GetMapping("/student/{id}")
    public ResultVO findById(@PathVariable Integer id){
        final Student student = service.getById(id);
        return new ResultVO.Builder<>().code(200).message("success").data(student).build();

    }

    @GetMapping("/student/list")
    public ResultVO findAll(){
        final List<Student> list = service.list();
        return new ResultVO.Builder<>().code(200).message("success").data(list).build();
    }
    @DeleteMapping("/remove/{id}")
    public ResultVO removeById(@PathVariable Integer id){
        final boolean b = service.removeById(id);
        return new ResultVO.Builder<>().code(200).message("success").data(b).build();
    }
}
