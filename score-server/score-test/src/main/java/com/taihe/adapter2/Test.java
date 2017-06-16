package com.taihe.adapter2;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
