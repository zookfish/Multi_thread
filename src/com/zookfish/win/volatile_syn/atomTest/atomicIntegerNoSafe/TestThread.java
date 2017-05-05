package com.zookfish.win.volatile_syn.atomTest.atomicIntegerNoSafe;

/**
 * Created by Administrator on 2017/5/5.
 */
public class TestThread extends Thread {
    private MyService myService;

    public TestThread (MyService myService) {
        super();
        this.myService  = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }

    public static void main(String[] args) {
        try {
            MyService ms = new MyService();
            TestThread[] ths = new TestThread[5];

            for (int i = 0; i < ths.length; i++) {
                ths[i] = new TestThread(ms);
            }

            for (int i = 0; i < ths.length; i++) {
                ths[i].start();
            }

            Thread.sleep(1000);
            System.out.println(MyService.al.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
