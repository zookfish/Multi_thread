package com.zookfish.win.volatile_syn;

/**
 * Created by Administrator on 2017/5/5.
 */
public class PrintString2 implements Runnable {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {

//        try {
            while (isContinuePrint ==true) {
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
//                Thread.sleep(1000);
            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void run() {
        printStringMethod();
    }


    public static void main(String[] args) {
        try {
            PrintString2 ps = new PrintString2();
            new Thread(ps).start();
            Thread.sleep(30);
            System.out.println("我要停止!" + Thread.currentThread().getName());
            ps.setContinuePrint(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
