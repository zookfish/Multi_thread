package com.yunux.t5.stop;

/**
 * Created by Administrator on 2017/4/19.
 *
 * 停止线程!   异常法
 *
 */
public class Demo1 extends Thread {

    @Override
    public void run() {

        super.run();
        try {
            for (int i = 0; i <500000; i++) {
                if(this.isInterrupted()) {
                    System.out.println("已经是停止状态了,我要退出了!");
    //                break;
                    throw  new InterruptedException();
                }
                System.out.println("i=" + (i+1));
            }
            System.out.println("我还能不能执行呢？很好奇!!!!!!");
        } catch (InterruptedException e){
            System.out.println("进入cacth语句里面了!@@@@@");
        }

    }

    public static void main(String[] args) {
        try {
            Demo1 d = new Demo1();
            d.start();
            d.sleep(2000);
            d.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End！  ");
    }
}
