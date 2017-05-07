package com.zookfish.win.volatile_syn.pipTest;

import java.io.PipedInputStream;

/**
 * Created by Administrator on 2017/5/7.
 */
public class ReadThread extends Thread {

    private ReadData readData;
    private PipedInputStream in;

    public ReadThread(ReadData readData,PipedInputStream in) {
        super();
        this.readData = readData;
        this.in = in;
    }

    @Override
    public void run() {
        readData.readMethod(in);
    }
}
