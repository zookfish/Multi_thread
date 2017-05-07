package com.zookfish.win.volatile_syn.stack;

/**
 * Created by Administrator on 2017/5/7.
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
