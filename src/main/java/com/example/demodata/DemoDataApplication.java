package com.example.demodata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(value = "com.example.demodata.dal.dao", annotationClass = Repository.class)
public class DemoDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDataApplication.class, args);
    }

}
