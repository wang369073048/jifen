package com.taihe.factory1;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mailSender send.");
    }
}
