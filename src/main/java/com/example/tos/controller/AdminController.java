package com.example.tos.controller;

import com.example.tos.pojo.Administrator;
import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "/templates")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping(value = "/selectAdmin",method = RequestMethod.POST)
    @ResponseBody
    public Result<Administrator> selectAdmin(@RequestBody Map<String, String> person) {
        String id = person.get("id");
        Administrator administrator = adminService.select(id);
        return ResultUtil.sussess(administrator);
    }

    @RequestMapping(value = "/adminUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Result updateAdmin(@RequestBody Administrator administrator) {
        adminService.update(administrator);
        return ResultUtil.sussess();
    }
}
