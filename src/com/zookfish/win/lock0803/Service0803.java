package com.zookfish.win.lock0803;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service0803 {
    public ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void waitMethod() {

        try {
            // 获取锁
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放所
            lock.unlock();
        }
    }

}
