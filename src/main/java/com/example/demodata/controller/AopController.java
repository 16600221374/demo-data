package com.example.demodata.controller;

import com.example.demodata.javaII.aop.AopTestImpl;
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

    public static void main(String[] args) {

        //== 的作用：
        //　　基本类型：比较值是否相等
        //　　引用类型：比较内存地址值是否相等
        //
        //equals 的作用:
        //　　引用类型：默认情况下，比较内存地址值是否相等。可以按照需求逻辑，重写对象的equals方法。
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }

}
