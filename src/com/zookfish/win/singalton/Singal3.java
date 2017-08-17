package com.zookfish.win.singalton;

import java.io.*;

public class Singal3 implements Serializable{


    private static final long serialVersionUID = 8393536814104029455L;
    // 内部类方式生成
    private static class MyObjectHandler {
        private static Singal3 instance = new Singal3();
    }

    private Singal3() {

    }


    public static Singal3 getInstance() {
        return MyObjectHandler.instance;
    }

    // 解决内部类单例的问题
    protected Object readResolve() {
        System.out.println("readResolve方法调用了");
        return MyObjectHandler.instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singal3 s3 = Singal3.getInstance();
        FileOutputStream fosref = new FileOutputStream(new File("singal3.txt"));
        ObjectOutputStream out = new ObjectOutputStream(fosref);
        out.writeObject(s3);
        fosref.close();
        out.close();
        System.out.println(s3.hashCode());

        FileInputStream finref = new FileInputStream(new File("singal3.txt"));
        ObjectInputStream in = new ObjectInputStream(finref);
        Singal3 res = (Singal3)in.readObject();
        finref.close();
        in.close();
        System.out.println(res.hashCode());
    }


}
