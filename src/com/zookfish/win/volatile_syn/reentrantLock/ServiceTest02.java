package com.zookfish.win.volatile_syn.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/5/9.
 */
public class ServiceTest02 {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethods() {
        try {
            lock.lock();
            System.out.println("ThreadName :" + Thread.currentThread().getName());
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        try {
            final ServiceTest02 s2 = new ServiceTest02();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    s2.serviceMethods();
                }
            };

            Thread[] threadArray = new Thread[10];
            for (int i = 0; i < 10; i++) {
                threadArray[i] = new Thread(runnable);
            }

            for (int i = 0; i < 10; i++) {
                threadArray[i].start();
            }

            Thread.sleep(2000);
            //getQueueLength() 返回此等待此锁的线程估计数

            System.out.println("有线程数:" + s2.lock.getQueueLength());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
