package com.yunux.t1;


/**
 * Created by Administrator on 2017/4/16.
 */
public class Mythread extends Thread {
    private int count = 5;

    public Mythread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0) {
            count --;
            System.out.println("由" + this.currentThread().getName() + "计算,count= " + count);
        }
    }
}
