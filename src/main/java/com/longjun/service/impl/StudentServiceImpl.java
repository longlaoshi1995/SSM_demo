package com.longjun.service.impl;

import com.longjun.dao.IStudent;
import com.longjun.domain.Student;
import com.longjun.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//œ‡µ±≈‰÷√¡Àbean
@Service("IStudentService")
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudent iStudent;
    public String save(Student student) {
        String res =  "success";
        try {
            iStudent.save(student);
        }catch (Exception e){
            res = "failure";
        }
        return res;
    }
}
