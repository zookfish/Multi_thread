package com.zookfish.win.condition.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimer1 {

    // new 一个Timer实际就是开启了一个线程
//    private static Timer timer= new Timer();
    // 后台运行
    private static Timer timerDae = new Timer(true);
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了,时间为:" + new Date());
        }
    }


    public static void main(String[] args) throws ParseException {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datestr = "2017-08-17 00:04:00";
        Date dateRef = sdf.parse(datestr);
        System.out.println("字符chuan时间为:" + dateRef.toString() + " 当前时间为:" + new Date().toString());
        // 如果当前时间大于设置运行的时间则直接运行
//        timer.schedule(task,dateRef);
        timerDae.schedule(task,dateRef);
    }

}
