package com.example.tos.controller;

import com.example.tos.pojo.Fillquestion;
import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.service.FillQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping(value = "/templates")
public class FillController {

    @Resource
    private FillQuestionService fillQuestionService;

    @RequestMapping(value = "/insertFillquestion",method = RequestMethod.POST)
    @ResponseBody
    public Result insertFillq(@RequestBody Fillquestion fillquestion) {
        fillQuestionService.insert(fillquestion);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/selectAllFillQuestion",method = RequestMethod.POST)
    @ResponseBody
    public Result<List<Fillquestion>> selectAllFill() {
        List<Fillquestion> fillquestions = fillQuestionService.select();
        return ResultUtil.sussess(fillquestions);
    }

    @RequestMapping(value = "/selectFillQuestionAt",method = RequestMethod.POST)
    @ResponseBody
    public Result<List<Fillquestion>> selectFillAt(@RequestBody Map<String, String> count) {
        int c = Integer.valueOf(count.get("number"));
        List<Fillquestion> fillquestions = fillQuestionService.selectAt(c);
        return ResultUtil.sussess(fillquestions);
    }

    @RequestMapping(value = "/updateFillquestion",method = RequestMethod.POST)
    @ResponseBody
    public Result updateFillq(@RequestBody Fillquestion fillquestion) {
        fillQuestionService.update(fillquestion);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/deleteFillQuestion",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteFill(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        fillQuestionService.delete(Integer.valueOf(id));
        return ResultUtil.sussess();
    }

}
