package com.yunux.t2;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Mythread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        //这里count-- 分为三个步骤
        /**
         * 获取count原有的值
         * count-1 计算
         * 将计算的结果赋值给count
         */
        count --;
        System.out.println("由 ：" + this.currentThread().getName() + "计算 ，count =" + count);
    }
}
