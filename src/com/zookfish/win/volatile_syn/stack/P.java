package com.zookfish.win.volatile_syn.stack;

/**
 * Created by Administrator on 2017/5/7.
 */
public class P {

    private MyStack myStack;


    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
