package com.zookfish.win.volatile_syn.atomTest.synchronizedUpdate;

/**
 * Created by Administrator on 2017/5/6.
 */
public class ThreadA extends Thread {

    private Service service;
    public ThreadA (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
