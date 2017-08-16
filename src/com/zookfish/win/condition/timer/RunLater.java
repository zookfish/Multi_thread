package com.zookfish.win.condition.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunLater {

    //演示Timer执行多个Task,task是按照添加的顺序放在队列中按序执行的  顺序执行的时间以前一个任务完成为准(设置的时间不一定是正确的)
    private static Timer timer = new Timer();

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin: 时间为" + new Date());
                Thread.sleep(20000);
                System.out.println("1 end:时间为" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("2 begin: 时间为" + new Date());
            System.out.println("2 end:时间为" + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {

        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = "2017-08-17 00:20:00";
        String date2 = "2017-08-17 00:20:10";
        timer.schedule(task1,sdf.parse(date1));
        timer.schedule(task2,sdf.parse(date2));
    }

}
