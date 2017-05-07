package com.zookfish.win.volatile_syn.pipTest;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by Administrator on 2017/5/7.
 */
public class ReadData {

    public void readMethod(PipedInputStream in) {

        try {
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int byteLength = in.read(bytes);

            while(byteLength != -1) {
                String newData =  new String(bytes,0,byteLength);
                System.out.println(newData);
                byteLength = in.read(bytes);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
