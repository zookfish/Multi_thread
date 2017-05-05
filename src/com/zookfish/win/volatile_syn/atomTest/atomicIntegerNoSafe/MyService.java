package com.zookfish.win.volatile_syn.atomTest.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2017/5/5.
 */
public class MyService {
    public static AtomicLong al = new AtomicLong();

    public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:" + al.addAndGet(100));
        al.addAndGet(1);
    }
}
