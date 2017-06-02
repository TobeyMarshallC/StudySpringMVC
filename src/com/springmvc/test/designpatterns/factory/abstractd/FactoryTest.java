package com.springmvc.test.designpatterns.factory.abstractd;

/**
 * Created by Administrator on 2017/6/2.
 */
public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();

    }
}
