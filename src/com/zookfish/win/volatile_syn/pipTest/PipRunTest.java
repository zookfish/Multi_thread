package com.zookfish.win.volatile_syn.pipTest;

import com.zookfish.win.volatile_syn.wait_notify_test.WaitThread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/5/7.
 */
public class PipRunTest {

    public static void main(String[] args) {

        try {
            WriteData wd = new WriteData();
            PipedOutputStream out = new PipedOutputStream();

            ReadData rd = new ReadData();
            PipedInputStream in = new PipedInputStream();

            out.connect(in);

            WriteThread wThread = new WriteThread(wd,out);
            ReadThread rThread = new ReadThread(rd,in);
            rThread.start();
            Thread.sleep(1000);
            wThread.start();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
