package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
    @MapperScan("com.bjpowernode.mapper")
    @SpringBootApplication
    public class ReggieApplication {

        public static void main(String[] args) {
            SpringApplication.run(com.bjpowernode.ReggieApplication.class, args);
        }

    }

