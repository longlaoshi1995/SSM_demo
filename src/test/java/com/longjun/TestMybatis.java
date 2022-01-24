package com.longjun;

import com.longjun.dao.IStudent;
import com.longjun.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    @Test
    public void test() throws IOException {

        //加载配置文件
        SqlSessionFactoryBuilder builer = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = builer.build(is);
        SqlSession sqlSession = factory.openSession();

        //获取接口的对象
        IStudent iStudent = sqlSession.getMapper(IStudent.class);

        //创建实体类的对象
        Student student = new Student();
        student.setName("龙军");
        student.setSex(0);
        student.setAge(26);
        student.setBirthPlace("重庆开州");
        student.setGruateSchool("重庆大学");
        student.setBobby("网易云，跑步");

        //执行语句
        try {
            iStudent.save(student);
        }catch (Exception e){
            System.out.println("执行语句有问题");
        }

        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();

    }
}
