package com.zookfish.win.lock0803;

public class Run0803 {

    public static void main(String[] args) throws InterruptedException {
        final Service0803 service = new Service0803();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread A = new Thread(runnable);
        A.start();
        Thread.sleep(500);

    }
}
