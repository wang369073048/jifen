package com.taihe.factory2;

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

    public static Sender produceMailSender(){
        return new MailSender();
    }
}

class  Test{
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMailSender();
        sender.send();
    }
}
