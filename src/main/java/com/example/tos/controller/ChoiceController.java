package com.example.tos.controller;


import com.example.tos.pojo.Choicequsetion;
import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.service.ChoiceQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/templates")
public class ChoiceController {

    @Resource
    private ChoiceQuestionService choiceQuestionService;

    @RequestMapping(value = "/insertChoicequsetion",method = RequestMethod.POST)
    @ResponseBody
    public Result insertChoice(@RequestBody Choicequsetion choicequsetion) {
        choiceQuestionService.insert(choicequsetion);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/selectAllChoiceQuestion",method = RequestMethod.POST)
    @ResponseBody
    public Result<List<Choicequsetion>> selectAllChoice() {
        List<Choicequsetion> choicequsetions = choiceQuestionService.select();
        return ResultUtil.sussess(choicequsetions);
    }

    @RequestMapping(value = "/selectChoiceQuestionAt",method = RequestMethod.POST)
    @ResponseBody
    public Result<List<Choicequsetion>> selectChoiceAt(@RequestBody Map<String, String> count) {
        int c = Integer.valueOf(count.get("number"));
        List<Choicequsetion> choicequsetions = choiceQuestionService.selectAt(c);
        return ResultUtil.sussess(choicequsetions);
    }

    @RequestMapping(value = "/updateChoicequsetion",method = RequestMethod.POST)
    @ResponseBody
    public Result updateChoice(@RequestBody Choicequsetion choicequsetion) {
        choiceQuestionService.insert(choicequsetion);
        return ResultUtil.sussess();
    }

    @RequestMapping(value = "/deleteChoicequestion",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteChoice(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        choiceQuestionService.delete(Integer.valueOf(id));
        return ResultUtil.sussess();
    }

}
