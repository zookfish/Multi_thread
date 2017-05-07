package com.zookfish.win.volatile_syn.wait_notify_insert_test;

/**
 * Created by Administrator on 2017/5/7.
 */
public class MyrunTest {

    public static void main(String[] args) {
        DBTools db = new DBTools();

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    db.backupA();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    db.backupB();
                }
            }).start();
        }
    }
}
