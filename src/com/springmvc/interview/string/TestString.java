package com.springmvc.interview.string;

/**
 * Java中常见字符串的区别
 * Created by Administrator on 2017/8/2.
 */
public class TestString {

    //String 是存在常量池的，编译时已经确定
    public static void main(String[] args) {
        String str = "jack";
        String str2 = new String("Jack");

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str.charAt('c'));
    }

}
