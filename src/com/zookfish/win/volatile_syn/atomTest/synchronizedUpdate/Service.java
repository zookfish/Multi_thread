package com.zookfish.win.volatile_syn.atomTest.synchronizedUpdate;

/**
 * Created by Administrator on 2017/5/6.
 */
public class Service  {

    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun == true) {
            System.out.println("++++++++++++++++++++++++++++++++++");
        }
        System.out.println("停下来啦！！！！！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
