package com.zookfish.win.volatile_syn.wait_notify_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/6.
 */
public class MyList  {

    private static List list = new ArrayList();
    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }

}
