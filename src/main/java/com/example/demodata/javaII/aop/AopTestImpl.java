package com.example.demodata.javaII.aop;

import com.example.demodata.javaII.aop.AopTest;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AopTestImpl
 * @Author: liuzuncai
 * @Description:
 * @Date: 2021/2/2 16:51
 * @Version: 1.0
 */
@Service
public class AopTestImpl implements AopTest {
    @Override
    public String save(String uname, int age) {
        //int a=0;
        //age= age/a;//打开上面两行报错，可触发异常通知
        System.out.println("come in personServerImpl save method...");
        return "hhhhh";
    }
}
