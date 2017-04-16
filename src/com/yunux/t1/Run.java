package com.yunux.t1;


/**
 * Created by Administrator on 2017/4/16.
 */
public class Run {
    public static void main(String[] args) {
        Mythread a = new Mythread("A");
        Mythread b = new Mythread("B");
        Mythread c = new Mythread("C");
        a.start();
        b.start();
        c.start();
    }

}
