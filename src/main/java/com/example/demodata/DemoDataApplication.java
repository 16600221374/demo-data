package com.example.demodata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Repository;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(value = "com.example.demodata.dal.dao", annotationClass = Repository.class)
public class DemoDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDataApplication.class, args);
    }

}
