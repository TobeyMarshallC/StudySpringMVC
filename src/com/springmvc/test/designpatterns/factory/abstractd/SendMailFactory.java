package com.springmvc.test.designpatterns.factory.abstractd;

/**
 * Created by Administrator on 2017/6/2.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
