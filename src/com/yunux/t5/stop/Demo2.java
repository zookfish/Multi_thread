package com.yunux.t5.stop;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Demo2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在sleep中被停止！进入catch" + this.isInterrupted());
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            Demo2 d = new Demo2();
            d.start();
            d.sleep(2000);
            d.interrupt();

        } catch (InterruptedException e) {
            System.out.println("main Catch!");
            e.printStackTrace();
        }
        System.out.println("End！   "  );
    }
}
