package com.springmvc.test.designpatterns.factory.staticf;

/**
 * Created by Administrator on 2017/6/2.
 */
public class FactoryTest {


    public static void main(String[] args) {
        Sender smsSender = SendFactory.produceSmsSender();
        smsSender.Send();
    }

}
