package com.zookfish.win.singalton;

import java.io.*;

public class Singal2 implements Serializable {

    private static Singal2 instance;

    private Singal2() {

    }

    // 效率低下
    public synchronized  static Singal2 getInstance() {
        if (instance == null) {
            instance = new Singal2();
        }
        return instance;
    }

    protected Object readResolve() {
        System.out.println("readresolve方法调用了");
        return getInstance();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singal2 s3 = Singal2.getInstance();
        FileOutputStream fosref = new FileOutputStream(new File("singal2.txt"));
        ObjectOutputStream out = new ObjectOutputStream(fosref);
        out.writeObject(s3);
        fosref.close();
        out.close();
        System.out.println(s3.hashCode());

        FileInputStream finref = new FileInputStream(new File("singal2.txt"));
        ObjectInputStream in = new ObjectInputStream(finref);
        Singal2 res = (Singal2)in.readObject();
        finref.close();
        in.close();
        System.out.println(res.hashCode());
    }

}
