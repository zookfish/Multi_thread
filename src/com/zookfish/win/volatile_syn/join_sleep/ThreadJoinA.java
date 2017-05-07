package com.zookfish.win.volatile_syn.join_sleep;

/**
 * Created by Administrator on 2017/5/7.
 */
public class ThreadJoinA extends Thread {

    private ThreadJoinB threadJoinB;

    public ThreadJoinA(ThreadJoinB threadJoinB) {
        super();
        this.threadJoinB = threadJoinB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadJoinB) {
                threadJoinB.start();
//                Thread.sleep(6000);
                threadJoinB.join(6000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
