package com.example.tos.controller;


import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@Controller
public class Text {

    @RequestMapping(value = "/easyexcel")
    public void easyexcelTest(){
        String path = "D:\\program\\IdeaProjects\\tos\\src\\main\\resources\\2007.xlsx";

      try{
            InputStream inputStream = new FileInputStream(new File(path));
            //InputStream inputStream = getServletContext().getResourceAsStream("2007.xlsx");
            List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 0));//从第0行读取
            inputStream.close();
            int i=0;
            for (Object ob:data) {
                System.out.println(i++);
                System.out.println(ob);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
