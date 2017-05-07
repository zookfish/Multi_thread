package com.zookfish.win.volatile_syn.join_sleep;

/**
 * Created by Administrator on 2017/5/7.
 */
public class RunJoinTest {

    public static void main(String[] args) {

        try {
            ThreadJoinB b = new ThreadJoinB();
            ThreadJoinA a = new ThreadJoinA(b);
            a.start();
            Thread.sleep(1000);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    b.bService();
                }
            }).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
