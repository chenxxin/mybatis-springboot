package com.xin.mapper;

import com.xin.entity.Address;
import com.xin.entity.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by CHENXINXIN on 2016/8/9.
 */

public interface StudentMapper {

    @Select("select * from student where stud_id=#{id}")
    @Results({
            @Result(property = "address", column = "addr_id", one = @One(select = "com.xin.mapper.StudentMapper.findAddressById"))
    })
    Student findStudentById(int id);

    @Select("select * from address where addr_id=#{id}")
    Address findAddressById(int id);
}
