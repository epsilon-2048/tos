package com.example.tos.controller;

import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.mapper.*;
import com.example.tos.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/templates")
public class UpdateController {

    @Resource
    AdminMapper adminMapper;
    @RequestMapping(value = "/adminUpdate",method = RequestMethod.POST)
    @ResponseBody
    public String updateAdmin(@RequestBody Administrator administrator) {
        int count = 0;
        try{
            count = adminMapper.update(administrator);
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
    StudentMapper studentMapper;
    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    @ResponseBody
    public String updateStu(@RequestBody Student student) {
        int count = 0;
        try{
            count = studentMapper.update(student);
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
    @RequestMapping(value = "/updateTeacher",method = RequestMethod.POST)
    @ResponseBody
    public String updateTea(@RequestBody Teacher teacher) {
        int count = 0;
        try {
            count = teacherMapper.update(teacher);
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
    @RequestMapping(value = "/updateFillquestion",method = RequestMethod.POST)
    @ResponseBody
    public String updateFillq(@RequestBody Fillquestion fillquestion) {
        int count;
        try {
            count = fillQuestionMapper.update(fillquestion);
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
    @RequestMapping(value = "/updateChoicequsetion",method = RequestMethod.POST)
    @ResponseBody
    public String insertChoice(@RequestBody Choicequsetion choicequsetion) {
        int count = 0;
        try {
            count = choicequsetionMapper.update(choicequsetion);
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
