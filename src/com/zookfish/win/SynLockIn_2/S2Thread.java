package com.zookfish.win.SynLockIn_2;

/**
 * Created by Administrator on 2017/4/27.
 */
public class S2Thread extends Thread {

    @Override
    public void run() {
        Sub s = new Sub();
        s.operatesubThread();
    }

    public static void main(String[] args) {
        S2Thread s = new S2Thread();
        s.start();
    }
}
