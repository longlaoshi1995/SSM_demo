package com.longjun.controller;

import com.longjun.domain.Student;
import com.longjun.service.IStudentService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService iStudentService;

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    //±£¥Ê
    @RequestMapping("/save")
    public String save(Student student){
        String res = iStudentService.save(student);
        return res;
    }
    //Ajax≤‚ ‘
    @RequestMapping("/ajax")
    @ResponseBody
    public Map<String, Object>  ajax(@RequestBody Map<String, Object> json){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("1",1);
        result.put("2",2);
        return result;
    }


}
