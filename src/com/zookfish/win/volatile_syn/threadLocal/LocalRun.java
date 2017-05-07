package com.zookfish.win.volatile_syn.threadLocal;

/**
 * Created by Administrator on 2017/5/7.
 */
public class LocalRun {

    public static void main(String[] args) {
        try {
            LocalA la = new LocalA();
            LocalB lb = new LocalB();
            la.start();
            Thread.sleep(1000);
            lb.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
