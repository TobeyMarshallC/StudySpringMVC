package com.springmvc.interview.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2017/8/2.
 */
public class ThirdCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }

    public static void main(String[] args) {
        ThirdCallable thirdCallable = new ThirdCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(thirdCallable);
        new Thread(ft).start();
        try {
            System.err.println("ft:"+ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
