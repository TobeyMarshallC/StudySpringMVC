package com.springmvc.test.designpatterns.factory.staticf;

/**
 * Created by Administrator on 2017/6/2.
 */
public class SendFactory {

    public static Sender produceSmsSender(){
        return new SmsSender();
    }

    public static Sender produceMailSender(){
        return new MailSender();
    }

}
