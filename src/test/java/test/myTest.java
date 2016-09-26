package test;

import com.xin.entity.Student;
import com.xin.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by CHENXINXIN on 2016/8/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SqlSession.class)
public class myTest {
    @Autowired
    private SqlSession sqlSession;

    @Test
    public void test() throws Exception {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.findStudentById(1);

        System.out.println("------------------------------------");
        System.out.println(student);
        System.out.println("------------------------------------");

    }
}
