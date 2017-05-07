package com.zookfish.win.volatile_syn.wait_notify_test;

/**
 * Created by Administrator on 2017/5/6.
 */
public class NotifyThread extends Thread {

    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if(MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已经发送了通知");
                    }
                    System.out.println("添加了 " + (i+1) + "个元素");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
