package com.zookfish.win.volatile_syn.wait_notify_test;


/**
 * Created by Administrator on 2017/5/6.
 */
public class WaitThread extends Thread {

    private Object lock;

    public WaitThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wati Begin............" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait End ............." + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
