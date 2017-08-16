package com.zookfish.win.condition.ReentrantReadWriteLockPac.Demo1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    // 读写锁 读锁是共享锁, 写锁是互斥锁   读锁之间可以共用  写锁是互斥的,   读锁和写锁是互斥的
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {

        try {
            try {
                // 根据结果看出读锁是可以共享的
                lock.readLock().lock();
                System.out.println("获取读锁:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void write() {
        try {
            try {
                // 根据结果看出读锁是可以共享的
                lock.writeLock().lock();
                System.out.println("获取写锁:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Service service = new Service();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                service.read();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.read();
            }
        });

        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                service.write();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                service.write();
            }
        });

//        t1.start();
//        t2.start();
        t3.start();
        t4.start();
    }
}
