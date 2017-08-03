package com.springmvc.interview.thread;

/**
 * Created by Administrator on 2017/8/2.
 */
public class SecondThread implements Runnable {

    @Override
    public void run() {
        System.err.println("second thread.");
    }

    public static void main(String[] args) {
        new Thread(new SecondThread()).start();
    }
}
