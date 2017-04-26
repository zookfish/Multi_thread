package com.yunux.t5;

/**
 * Created by Administrator on 2017/4/19.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + "begin()");
            Thread.sleep(3000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * sleep 暂停正在运行的线程
     * @param args
     */
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("begin = " + System.currentTimeMillis());
//        t.run();
        t.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
