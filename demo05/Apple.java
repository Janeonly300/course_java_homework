package com.atjianyi.demo05;

public class Apple implements Fruit{
    @Override
    public void eat() {
        System.out.println(this.getClass().getName()+"eat");
    }
}
