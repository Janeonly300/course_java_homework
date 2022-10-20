package com.atjianyi.demo00;

import java.util.Scanner;

/**
 * 水仙花
 * */
public class WaterFlowerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(!(i<1000&&i>=0)) {
            throw new RuntimeException("20001");
        }
        //去除个位
        int bai = i/100;
        int ge = i%10;
        int shi = i%100/10;
        int sum = bai*bai*bai+ge*ge*ge+shi*shi*shi;

        if(sum == i) {
            System.out.println(i+"是水仙花数=");
        }

    }
}
