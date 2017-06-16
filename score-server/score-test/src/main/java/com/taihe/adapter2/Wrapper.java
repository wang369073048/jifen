package com.taihe.adapter2;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(){};
    public Wrapper (Source source) {
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2 !");
    }
}
