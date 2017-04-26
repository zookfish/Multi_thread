package com.yunux.t4;

/**
 * Created by Administrator on 2017/4/17.
 *
 * 注意this 和 Thread.currentThread()  的区别
 *
 *
 */
public class CountOperate extends Thread {
    private CountOperate() {
        System.out.println("CountOperate----begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive() = " + Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());

        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread.getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()" + this.getName());
        System.out.println("this.isAlive()" + this.isAlive());

        System.out.println("run---end");
    }


    public static void main(String[] args) {
        CountOperate c  = new CountOperate();
        // 贤臣对象c作为参数传递给Thread t1被调用时，实际上是调用的c.run()
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());

    }


}
