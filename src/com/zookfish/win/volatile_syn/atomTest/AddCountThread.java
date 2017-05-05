package com.zookfish.win.volatile_syn.atomTest;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2017/5/5.
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread act  = new AddCountThread();
        Thread t1 = new Thread(act);
        t1.start();
        Thread t2 = new Thread(act);
        t2.start();
        Thread t3 = new Thread(act);
        t3.start();
        Thread t4 = new Thread(act);
        t4.start();
        Thread t5 = new Thread(act);
        t5.start();
    }
}
