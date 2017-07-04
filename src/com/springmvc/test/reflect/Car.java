package com.springmvc.test.reflect;

/**
 * Created by Administrator on 2017/7/4.
 */
public class Car {

    private String brand;
    private String color;
    private int maxSpeed;

    public Car(){}

    public Car(String bd,String cl,int ms){
        this.brand = bd;
        this.color = cl;
        this.maxSpeed = ms;
    }

    public void introduce(){
        System.out.println("The brand is :"+this.brand+",color is :"+this.color+",maxSpeed is :"+this.maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
