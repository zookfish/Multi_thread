package com.zookfish.win.SynLockIn_1;

import com.yunux.t1.Mythread;

/**
 * Created by Administrator on 2017/4/26.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
}
