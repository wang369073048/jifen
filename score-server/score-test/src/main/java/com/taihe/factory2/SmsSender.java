package com.taihe.factory2;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smsSender!");
    }
}
