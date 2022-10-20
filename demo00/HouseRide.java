package com.atjianyi.demo00;

/**
 * 小马问题
 */
public class HouseRide {
    public static void main(String[] args) {
        int a ,b ,c = 0;
        for(a = 1;a<=33;a++) {
            for(b =1;b<=50;b++) {
                c = 100-a-c;
                if(a*3+b*2+c*0.5 == 100) {
                    System.out.println(a+" "+ b+" "+c);
                }
            }
        }

    }
}
