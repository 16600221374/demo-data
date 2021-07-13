package com.example.demodata.javaII.thread;

/**
 * @ClassName: MyThread
 * @Author: liuzuncai
 * @Description:
 * @Date: 2021/7/1 11:50
 * @Version: 1.0
 */
public class MyThread extends Thread {
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                System.out.println("i=" + (i + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Thread.sleep(200);
    }
}

class Run {
    public static void main(String args[]) {
        Thread thread = new MyThread();
        thread.start();
        try {
            thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
