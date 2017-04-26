package com.yunux.t5;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Demo2 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i+1));
        }
    }

    public static void main(String[] args) {
        try {
            Demo2 d = new Demo2();
            d.start();
            Thread.sleep(1000);
            d.interrupt();

        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

    }
}
