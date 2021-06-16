package com.example.demodata.javaII.thread;

import java.util.concurrent.Callable;

/**
 * @ClassName: ThreadFutureTest
 * @Author: liuzuncai
 * @Description:
 * @Date: 2021/6/3 17:54
 * @Version: 1.0
 */
public class ThreadFutureTest implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("hhhhhhhhhhhhhh");
        return null;
    }
}
