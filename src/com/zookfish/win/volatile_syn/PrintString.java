package com.zookfish.win.volatile_syn;

/**
 * Created by Administrator on 2017/5/5.
 */
public class PrintString {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }


    public void printStringMethod() {

        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        PrintString ps = new PrintString();
        ps.printStringMethod();
        System.out.println("我要停止它! stopThread=" + Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }

}
