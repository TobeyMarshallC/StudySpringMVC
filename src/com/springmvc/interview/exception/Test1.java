package com.springmvc.interview.exception;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(test2());
    }

    public static int test1(){
        int i = 1;
        try{
            System.out.println("try...");
            //return i+=10;
        }catch (Exception ex){
            System.out.println("catch...");
        }finally {
            i++;
            System.out.println("finally...");
            System.out.println("i="+i);
        }
        return i;
    }

    public static int test2(){
        int i = 1;
        try{
            System.out.println("try...");
            return i+=10;
        }catch (Exception ex){
            System.out.println("catch...");
        }finally {
            i++;
            System.out.println("finally...");
            System.out.println("i="+i);
            return i;
        }
    }





}
