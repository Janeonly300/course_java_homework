package com.atjianyi.demo04;

public class Computer {
    public  static void plugin(IUsb iUsb){
        iUsb.start();

        System.out.println("===========");
        iUsb.stop();
    }
}
