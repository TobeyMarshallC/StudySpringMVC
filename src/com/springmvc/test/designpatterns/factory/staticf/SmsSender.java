package com.springmvc.test.designpatterns.factory.staticf;

/**
 * Created by Administrator on 2017/6/2.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("This is sms sender!");
    }
}
