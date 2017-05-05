package com.zookfish.win.volatile_syn.volatitleTest;

/**
 * Created by Administrator on 2017/5/5.
 */
public class Test01 extends Thread {

    volatile public static int count;

     private static void addCount() {
        for (int i =0;i<100; i++) {
            count ++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        Test01[] ts = new Test01[100];
        for (int i = 0; i < ts.length;i++){

            ts[i] = new Test01();
        }
        for (int i=0;i<ts.length;i++) {
            ts[i].start();
        }
    }
}
