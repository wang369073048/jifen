package com.taihe.adapter;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is method2 !");
    }
}
