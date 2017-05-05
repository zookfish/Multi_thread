package com.zookfish.win.deadLockTest;


/**
 * Created by Administrator on 2017/4/28.
 */
public class DealThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag (String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按照Lock1--->Lock2的顺序执行了");
                }
            }
        }
        if(username.equals("b")) {
            synchronized (lock2) {
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("按照Lock2--->Lock1的順序至執行了");
                }
            }
        }

    }


    public static void main(String[] args) {
        try {
            DealThread d = new DealThread();
            d.setFlag("a");
            Thread t1 = new Thread(d);
            t1.start();
            Thread.sleep(100);
            d.setFlag("b");
            Thread t2 = new Thread(d);
            t2.start();

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
