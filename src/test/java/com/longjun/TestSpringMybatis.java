package com.longjun;

import com.longjun.dao.IStudent;
import com.longjun.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class TestSpringMybatis {
    @Test
    public void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudent iStudent = (IStudent) context.getBean("IStudent");

        Student student = new Student();
        student.setName("龙帅11");
        student.setSex(0);
        student.setAge(23);
        student.setBirthPlace("重庆开州");
        student.setGruateSchool("开州中学");
        student.setBobby("王者荣耀");
        iStudent.save(student);
    }
}
