package com.zookfish.win.singalton;

import com.yunux.t1.Run;

public class StaticSingal {

    private static StaticSingal instance = null;

    private StaticSingal() {

    }

    static {
        System.out.println("静态代码块被调用了");
        instance = new StaticSingal();
    }

    public static StaticSingal getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable(){

                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(StaticSingal.getInstance().hashCode());
                    }
                }
            }).start();
        }



    }

}
