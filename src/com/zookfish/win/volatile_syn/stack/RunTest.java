package com.zookfish.win.volatile_syn.stack;

/**
 * Created by Administrator on 2017/5/7.
 */
public class RunTest {

    public static void main(String[] args) {
        //一个生产者对一个消费者
        /*MyStack myStack = new MyStack();
        P p = new P(myStack);  //生产者
        C c = new C(myStack);  //消费者
        PThread pthread = new PThread(p);
        CThread cthread = new CThread(c);
        pthread.start();
        cthread.start();*/

        //一个生产者对多个消费者
        MyStack myStack = new MyStack();
        P p = new P(myStack);  //生产者
        C c1 = new C(myStack);  //消费者
        C c2 = new C(myStack);  //消费者
        C c3 = new C(myStack);  //消费者
        C c4 = new C(myStack);  //消费者
        C c5 = new C(myStack);  //消费者
        PThread pthread = new PThread(p);
        CThread cthread1 = new CThread(c1);
        CThread cthread2 = new CThread(c2);
        CThread cthread3 = new CThread(c3);
        CThread cthread4 = new CThread(c4);
        CThread cthread5 = new CThread(c5);
        pthread.start();
        cthread1.start();
        cthread2.start();
        cthread3.start();
        cthread4.start();
        cthread5.start();

    }
}
