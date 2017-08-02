package com.springmvc.interview.thread;

import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/8/2.
 */
public class FouthThread {
    public static void main(String[] args) {
        Executors.newFixedThreadPool(3).execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("newFixed");
            }
        });
    }
}
