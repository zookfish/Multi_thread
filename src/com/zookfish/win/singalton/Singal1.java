package com.zookfish.win.singalton;

// 常见的单例模式1
public class Singal1 {

    private static final Singal1  instance = new Singal1();

    private Singal1() {

    }

    // 饿汉模式
    public Singal1 getInstance() {
        return instance;
    }


}
