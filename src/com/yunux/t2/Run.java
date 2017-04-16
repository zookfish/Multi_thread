package com.yunux.t2;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Run {

    public static void main(String[] args) {
        //共享变量
        Mythread t = new Mythread();

        Thread a = new Thread(t,"a");
        Thread b = new Thread(t,"b");
        Thread c = new Thread(t,"c");
        Thread d = new Thread(t,"d");
        Thread e = new Thread(t,"e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
