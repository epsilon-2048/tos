package com.example.tos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 陈少鑫
 *
 */


@SpringBootApplication
@MapperScan("com.example.tos.mapper")
public class TosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TosApplication.class, args);
    }

}
