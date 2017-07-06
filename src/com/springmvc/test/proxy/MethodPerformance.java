package com.springmvc.test.proxy;

/**
 * 用于记录性能监视信息
 * Created by Tobey Marshall on 2017/7/6.
 */
public class MethodPerformance {
    private long begin;
    private long end;
    private String serviceMethod;
    public MethodPerformance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        //记录目标方法开始执行点的系统时间
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;

        //执行时间
        System.out.println(serviceMethod+"花费"+elapse+"毫秒");
    }

}
