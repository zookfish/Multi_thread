package com.yunux.thread;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Run {
    public static void main(String[] args) {
        try {
            /*MyThread myThread= new MyThread();
            myThread.setName("mythread");
            myThread.start();   // 线程就绪  start的顺序不是代码执行的顺序
            for (int i =0;i<10;i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }*/
            Runnable runnable = new MyRunnable();
            Thread thread = new Thread(runnable);
            thread.sleep(1000);
            thread.start();
            System.out.println("运行结束!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
