package com.taihe.factory3;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class Test {
    public static void main(String[] args) {
        Provider factory = new SmsSenderFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
