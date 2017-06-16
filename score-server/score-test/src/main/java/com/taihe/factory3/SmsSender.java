package com.taihe.factory3;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smsSender!");
    }
}
