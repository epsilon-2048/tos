package com.example.tos.controller;


import com.example.tos.pojo.Student;
import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "/templates")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/insertStudent",method = RequestMethod.POST)
    @ResponseBody
    public Result insertStu(@RequestBody Student student) {
        studentService.insert(student);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/selectStudent",method = RequestMethod.POST)
    @ResponseBody
    public Result<Student> selectStu(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        Student student = studentService.select(id);
        return ResultUtil.sussess(student);
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteStu(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        studentService.delete(id);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    @ResponseBody
    public Result updateStu(@RequestBody Student student) {
        studentService.update(student);
        return ResultUtil.sussess();
    }
}
