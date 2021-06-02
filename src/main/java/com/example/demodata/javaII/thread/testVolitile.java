package com.example.demodata.javaII.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: testVolitile
 * @Author: liuzuncai
 * @Description: 测试volitile
 * @Date: 2021/6/1 14:44
 * @Version: 1.0
 */
public class testVolitile {

    private static volatile Integer race = 0;

    private static void increase() {
        synchronized (race){
            race++;
        }

    }

    public static void main(String[] args) {
        Thread[] thread = new Thread[20];
        for (int i = 0; i<20; i++) {
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<100;j++)
                        increase();
                }
            });
            thread[i].start();
        }
        System.out.println(race);
    }
}
