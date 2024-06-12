package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

// 关注程序员青戈的公众号：Java学习指南，回复：软件，就可以获取到全部的必须的软件，包括 redis，jdk，node，navicat等等
@SpringBootApplication
@EnableCaching
@MapperScan("com.example.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("后台接口地址：http://localhost:9090/swagger-ui/index.html");
    }

}
