package com.zookfish.win.volatile_syn.atomTest.synchronizedUpdate;

/**
 * Created by Administrator on 2017/5/6.
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA ta = new ThreadA(service);
            ThreadB tb = new ThreadB(service);
            ta.start();
            Thread.sleep(1000);
            tb.start();
            System.out.println("已经发起了停止命令了!!!!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
