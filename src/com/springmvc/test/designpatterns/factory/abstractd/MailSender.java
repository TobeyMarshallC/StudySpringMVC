package com.springmvc.test.designpatterns.factory.abstractd;

/**
 * Created by Administrator on 2017/6/2.
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("This is Mail Sender");
    }
}
