package com.atjianyi.demo2;

public class Employee {
    public int num;
    public static int sNum;

    static {
        System.out.println("静态方法执行");
    }

    {
        System.out.println("非静态方法执行");
    }


    public Employee(){
        System.out.println("构造执行");
    }
}
