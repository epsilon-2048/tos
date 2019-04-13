package com.example.tos.controller;

import com.example.tos.pojo.Teacher;
import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "/templates")
public class TeacherController  {

    @Resource
    private TeacherService teacherService;

    @RequestMapping(value = "/insertTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Result insertTea(@RequestBody Teacher teacher) {
        teacherService.insert(teacher);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/selectTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Result<Teacher> selectTea(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        Teacher teacher = teacherService.select(id);
        return  ResultUtil.sussess(teacher);
    }

    @RequestMapping(value = "/updateTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Result updateTea(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/deleteTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteTea(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        teacherService.delete(id);
        return ResultUtil.sussess();
    }

}
