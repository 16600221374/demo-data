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
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    System.out.println(System.currentTimeMillis());
                    e.printStackTrace();
                }
            });
        }
        System.out.println(1111111);
        Thread thread = findThread(13L);
        System.out.println(System.currentTimeMillis());
        thread.interrupt();
    }

    //根据id获取线程
    private static Thread findThread(Long threadId) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup != null) {
            int size = Thread.activeCount();
            Thread[] threads = new Thread[(int)(size*1.5)];
            threadGroup.enumerate(threads,true);
            for(Thread thread:threads) {
                if(threadId == thread.getId()) {
                    return thread;
                }
            }
            threadGroup = threadGroup.getParent();
        }
        return null;
    }
}
