package com.example.tos.controller;


import com.example.tos.result.CodeEnum;
import com.example.tos.result.TosException;
import com.example.tos.mapper.ChoicequsetionMapper;
import com.example.tos.mapper.FillQuestionMapper;
import com.example.tos.mapper.StudentMapper;
import com.example.tos.mapper.TeacherMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/templates")
public class DeleteController {

    @Resource
    StudentMapper studentMapper;
    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    @ResponseBody
    public String deleteStu(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        int count = studentMapper.delete(id);
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }
    @Resource
    TeacherMapper teacherMapper;
    @RequestMapping(value = "/deleteTeacher",method = RequestMethod.POST)
    @ResponseBody
    public String deleteTea(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        int count = teacherMapper.delete(id);
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }

    @Resource
    FillQuestionMapper fillQuestionMapper;
    @RequestMapping(value = "/deleteFillQuestion",method = RequestMethod.POST)
    @ResponseBody
    public String deleteFill(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        int count = fillQuestionMapper.delete(Integer.valueOf(id));
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }

    @Resource
    ChoicequsetionMapper choicequsetionMapper;
    @RequestMapping(value = "/deleteChoicequestion",method = RequestMethod.POST)
    @ResponseBody
    public String deleteChoice(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        int count = choicequsetionMapper.delete(Integer.valueOf(id));
        if (count == 0) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return "success";
        }
    }

}
