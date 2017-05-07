package com.zookfish.win.volatile_syn.pipTest;


import com.zookfish.win.volatile_syn.wait_notify_test.WaitThread;

import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/5/7.
 */
public class WriteThread extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;
    public WriteThread(WriteData writeData,PipedOutputStream out) {
        super();
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
