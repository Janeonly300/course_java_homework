package com.atjianyi.demo04;

public class Print implements IUsb {

    @Override
    public void start() {
        System.out.println(this.getClass().getName()+"start");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getName()+"stop");
    }
}
