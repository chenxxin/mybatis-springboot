package com.xin.service;

import com.xin.entity.Student;
import com.xin.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenxinxin on 2016/8/10.
 */
@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student findStudentById(int id){
        log.info("find Student by id :{}", id);

        return studentMapper.findStudentById(id);
    }

}
