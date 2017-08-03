package com.springmvc.interview.thread;

/**
 * Created by Administrator on 2017/8/2.
 */
public class FirstThread extends Thread {

    @Override
    public void run(){
        System.err.println("first thread.");
    }

    public static void main(String[] args) {
        new FirstThread().start();
    }
}

