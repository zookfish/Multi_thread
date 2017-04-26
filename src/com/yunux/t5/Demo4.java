package com.yunux.t5;


/**
 * Created by Administrator on 2017/4/19.
 */
public class Demo4 extends Thread {

    public static void main(String[] args) {

        try {
            Demo2 t = new Demo2();
            t.start();
            t.sleep(1000);
            t.interrupt();
            // isInterrupted 查看线程是够处于中断状态,且不能清除状态
            System.out.println("当前线程是否终止:" + t.isInterrupted() );
            System.out.println("当前线程是否终止:" + t.isInterrupted() );

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end ");
    }
}
