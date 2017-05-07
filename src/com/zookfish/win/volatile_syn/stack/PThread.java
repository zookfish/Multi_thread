package com.zookfish.win.volatile_syn.stack;


/**
 * Created by Administrator on 2017/5/7.
 */
public class PThread extends Thread {

    private P p;

    public PThread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {

        while (true) {
            p.pushService();
        }
    }
}
