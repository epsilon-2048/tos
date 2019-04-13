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
import java.util.*;

@Controller
@RequestMapping("/templates")

public class SelectController {

    @Resource
    StudentMapper studentMapper;
    @RequestMapping(value = "/selectStudent",method = RequestMethod.POST)
    @ResponseBody
    public Student selectStu(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        Student student = studentMapper.getOneById(id);
        if (null == student) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            return student;
        }
    }

    @Resource
    TeacherMapper teacherMapper;
    @RequestMapping(value = "/selectTeacher",method = RequestMethod.POST)
    @ResponseBody
    public Teacher selectTea(@RequestBody Map<String, String> person) {
        String id = person.get("id");
      //  System.out.println(id);
        Teacher teacher = teacherMapper.getOneById(id);
        if (null == teacher) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            //System.out.println(teacher);
            return teacher;
        }
    }

    @Resource
    AdminMapper adminMapper;
    @RequestMapping(value = "/selectAdmin",method = RequestMethod.POST)
    @ResponseBody
    public Administrator selectAdmin(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        //  System.out.println(id);
        Administrator administrator = adminMapper.getOneById(id);
        if (null == administrator) {
            throw new TosException(CodeEnum.ParamException);
        } else {
            //System.out.println(teacher);
            return administrator;
        }
    }

    @Resource
    FillQuestionMapper fillQuestionMapper;
    @RequestMapping(value = "/selectAllFillQuestion",method = RequestMethod.POST)
    @ResponseBody
    public List<Fillquestion> selectAllFill() {
        List<Fillquestion> fillquestions = fillQuestionMapper.getListAll();
        if (null == fillquestions) {
            throw new TosException(CodeEnum.DBException);
        } else {
            return fillquestions;
        }
    }

    @Resource
    ChoicequsetionMapper choicequsetionMapper;
    @RequestMapping(value = "/selectAllChoiceQuestion",method = RequestMethod.POST)
    @ResponseBody
    public List<Choicequsetion> selectAllChoice() {
        List<Choicequsetion> choicequsetions = choicequsetionMapper.getListAll();
        if (null == choicequsetions) {
            throw new TosException(CodeEnum.DBException);
        } else {
            return choicequsetions;
        }
    }

    @RequestMapping(value = "/selectChoiceQuestionAt",method = RequestMethod.POST)
    @ResponseBody
    public List<Choicequsetion> selectAllChoiceAt(@RequestBody Map<String, String> count) {
        int c = Integer.valueOf(count.get("number"));
        List<Choicequsetion> choicequsetions = choicequsetionMapper.getListAll();
        List<Choicequsetion> choicequsetionList = new ArrayList<>(c+1);
        int size = choicequsetions.size();
        if (size < c) throw new TosException(CodeEnum.ParamException);
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random(47);
        int cc = 0;
        while (true) {
            int n = random.nextInt(c);
            if (!set.contains(n)) {
                set.add(n);
                choicequsetionList.add(choicequsetions.get(n));
                cc++;
            }
            if (cc == c) break;
        }
        return choicequsetionList;
    }

    @RequestMapping(value = "/selectFillQuestionAt",method = RequestMethod.POST)
    @ResponseBody
    public List<Fillquestion> selectAllFillAt(@RequestBody Map<String, String> count) {
        int c = Integer.valueOf(count.get("number"));
        List<Fillquestion> fillquestions = fillQuestionMapper.getListAll();
        List<Fillquestion> fillquestionList = new ArrayList<>(c+1);
        int size = fillquestions.size();
        if (size < c) throw new TosException(CodeEnum.ParamException);
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random(47);
        int cc = 0;
        while (true) {
            int n = random.nextInt(c);
            if (!set.contains(n)) {
                set.add(n);
                fillquestionList.add(fillquestions.get(n));
                cc++;
            }
            if (cc == c) break;
        }
        return fillquestionList;
    }
}
