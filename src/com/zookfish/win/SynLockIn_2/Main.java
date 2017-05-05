package com.zookfish.win.SynLockIn_2;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Main {

    public int i =10;

    synchronized public void operateMainThread() {
        try {
            i --;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
