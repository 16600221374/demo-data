package com.example.demodata.javaII.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: ThreadPoolTest
 * @Author: liuzuncai
 * @Description: 线程池入门级例子
 * @Date: 2021/6/3 16:35
 * @Version: 1.0
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++){
            executorService.submit(() -> {
                System.out.println("this is "+ Thread.currentThread().getId());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
