package com.taihe.factory3;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class SmsSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
