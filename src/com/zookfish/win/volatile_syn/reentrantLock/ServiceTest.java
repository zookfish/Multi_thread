package com.zookfish.win.volatile_syn.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/5/9.
 */
public class ServiceTest {

    private ReentrantLock reentrantLock = new ReentrantLock();

    public void serviceMethod1() {

        try {
            reentrantLock.lock();
            System.out.println("serviceMethod1 getHoldCount : " + reentrantLock.getHoldCount());
            serviceMethod2();
        } finally {
            reentrantLock.unlock();
            System.out.println("过程四的个数: " + reentrantLock.getHoldCount());
        }
    }

    public void serviceMethod2() {
        try {
            reentrantLock.lock();
            System.out.println("serviceMethod2 getHoldCount : " + reentrantLock.getHoldCount());
        } finally {
            reentrantLock.unlock();
            System.out.println("过程三的个数:  " + reentrantLock.getHoldCount());
        }
    }

    public static void main(String[] args) {
        ServiceTest st = new ServiceTest();
        st.serviceMethod1();
        // getHoldCount()   获取lock.lock的次数  保持lock锁的个数
    }
}
