package com.yunux.t5;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Demo3 {
    public static void main(String[] args) {
        // 中断线程,其实并不能中断
        Thread.currentThread().interrupt();
        // 第一次调用为true
        System.out.println("当前线程是否停止: " + Thread.interrupted());
        // 第二次调用为false 清楚了第一次的状态
        System.out.println("当前线程是否停止: " + Thread.interrupted());
        System.out.println("222222222");
    }
}
