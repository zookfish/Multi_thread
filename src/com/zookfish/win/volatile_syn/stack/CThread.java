package com.zookfish.win.volatile_syn.stack;


/**
 * Created by Administrator on 2017/5/7.
 */
public class CThread extends Thread {

    private C c;

    public CThread(C c) {
        super();

        this.c = c;


    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
