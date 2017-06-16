package com.taihe.factory1;

/**
 * Created by hzwzhen on 2017/6/16.
 */
public class SendFactory {

    public static Sender produceSender(String type){
        Sender sender = null;
        if (type.equalsIgnoreCase("mail")) {
             sender = new MailSender();
        } else if (type.equalsIgnoreCase("sms")) {
             sender = new SmsSender();
        }
        return sender;
    }
}

class  Test{
    public static void main(String[] args) {
        Sender sender = SendFactory.produceSender("mail");
        sender.send();
    }
}
