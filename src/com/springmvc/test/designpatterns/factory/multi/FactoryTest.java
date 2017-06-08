package com.springmvc.test.designpatterns.factory.multi;

/**
 * Created by Administrator on 2017/6/2.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender send = factory.produceMail();
        send.Send();
    }
}
