package com.xin.service;

import com.xin.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * Created by chenxinxin on 2016/8/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void findStudentById() throws Exception {

        System.out.println("--------------------------------");

        Student student = studentService.findStudentById(1);
        System.out.println(student);

        System.out.println("--------------------------------");
    }

}