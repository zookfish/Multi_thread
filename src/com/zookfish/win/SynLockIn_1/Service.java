package com.zookfish.win.SynLockIn_1;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized private void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized private void service3() {
        System.out.println("service3");
    }
}
