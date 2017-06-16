package com.taihe.adapter;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
