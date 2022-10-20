package com.atjianyi.demo00;

public class ThreadDemoTest {
    static  int num =100;
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();



    }
}
class MyThread implements Runnable{
    static int num = 100;
    @Override
    public void run() {
        while(num>0){
            System.out.println(Thread.currentThread().getName()+"::"+num );
            num--;
        }


    }
}