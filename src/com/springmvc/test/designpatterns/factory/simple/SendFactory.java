package com.springmvc.test.designpatterns.factory.simple;

/**
 * 工厂类
 * Created by Administrator on 2017/6/2.
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
