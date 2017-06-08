package com.springmvc.test.designpatterns.factory.multi;

/**
 * Created by Administrator on 2017/6/2.
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
