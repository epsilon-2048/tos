package com.example.tos.controller;


import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.mapper.ChoicequsetionMapper;
import com.example.tos.mapper.FillQuestionMapper;
import com.example.tos.mapper.StudentMapper;
import com.example.tos.mapper.TeacherMapper;
import com.example.tos.pojo.Choicequsetion;
import com.example.tos.pojo.Fillquestion;
import com.example.tos.pojo.Student;
import com.example.tos.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/templates")
public class InsertController {
    @Resource
    StudentMapper studentMapper;
    @RequestMapping(value = "/insertStudent",method = RequestMethod.POST)
    @ResponseBody
    public String insertStu(@RequestBody Student student) {
        int count = 0;
        try{
            count = studentMapper.insert(student);
        }catch (Exception e){
            e.printStackTrace();
            throw new TosException(CodeEnum.ParamException);
        }
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }

    @Resource
    TeacherMapper teacherMapper;
    @RequestMapping(value = "/insertTeacher",method = RequestMethod.POST)
    @ResponseBody
    public String insertTea(@RequestBody Teacher teacher) {
        int count = 0;
        try {
            count = teacherMapper.insert(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            throw new TosException(CodeEnum.ParamException);
        }
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }
    @Resource
    FillQuestionMapper fillQuestionMapper;
    @RequestMapping(value = "/insertFillquestion",method = RequestMethod.POST)
    @ResponseBody
    public String insertFillq(@RequestBody Fillquestion fillquestion) {
        int count;
        try {
            count = fillQuestionMapper.insert(fillquestion);
        } catch (Exception e) {
            e.printStackTrace();
            throw new TosException(CodeEnum.ParamException);
        }
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }
    @Resource
    ChoicequsetionMapper choicequsetionMapper;
    @RequestMapping(value = "/insertChoicequsetion",method = RequestMethod.POST)
    @ResponseBody
    public String insertChoice(@RequestBody Choicequsetion choicequsetion) {
        int count = 0;
        try {
            count = choicequsetionMapper.insert(choicequsetion);
        } catch (Exception e) {
            e.printStackTrace();
            throw new TosException(CodeEnum.ParamException);
        }
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }


}
