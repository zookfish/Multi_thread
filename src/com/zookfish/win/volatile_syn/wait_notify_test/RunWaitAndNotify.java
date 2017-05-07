package com.zookfish.win.volatile_syn.wait_notify_test;

/**
 * Created by Administrator on 2017/5/6.
 */
public class RunWaitAndNotify {

    public static void main(String[] args) {

        try {
            Object lock = new Object();
            WaitThread a = new WaitThread(lock);
            NotifyThread b = new NotifyThread(lock);
            a.start();
            Thread.sleep(50);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
