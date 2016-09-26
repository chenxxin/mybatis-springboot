package com.xin.controller;

import com.xin.entity.Student;
import com.xin.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHENXINXIN on 2016/8/9.
 */
@RequestMapping("/")
@RestController
public class HelloWorldController {
    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/test",  method = RequestMethod.GET)
    public String getDomainSuffix() throws Exception {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudentById(1);
        System.out.println("----------------------------------");
        System.out.println(student);
        System.out.println("----------------------------------");
        return "success";
    }
}
