package com.atjianyi.demo05;

public class Orange implements Fruit{
    @Override
    public void eat() {
        System.out.println(this.getClass().getName()+"eat");
    }
}
