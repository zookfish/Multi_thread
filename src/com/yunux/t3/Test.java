package com.yunux.t3;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Test extends Thread {

    private int i = 5;

    @Override
    public void run() {
        super.run();
        System.out.println("i= " + (i--) + "threadname=" + Thread.currentThread().getName());
    }

    /**
     * 虽然println 是同步的,但是i--是在计算出值之后在println中进行的
     * @param args
     */
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        Thread t5 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
