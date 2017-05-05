package com.zookfish.win.SynLockIn_2;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Sub extends Main {
    synchronized public void operatesubThread() {
        try{
            while (i>0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateMainThread();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
