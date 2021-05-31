package com.example.demodata.controller;

import com.example.demodata.javaII.AopTestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AopController
 * @Author: liuzuncai
 * @Description:
 * @Date: 2021/5/26 17:48
 * @Version: 1.0
 */
@RequestMapping("aopTest")
@RestController
public class AopController {

    @Autowired
    private AopTestImpl aopTestImpl;

    @RequestMapping("test")
    public void AopTest(){
        aopTestImpl.save("胡道权",23);
    }

}
