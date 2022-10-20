package com.atjianyi.demo06;

import java.util.Scanner;

/**
 * @Author 简一
 * @Date 2022/
 * 第五章作业
 */
public class DemoTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Scanner sc = new Scanner(System.in);
        String tempStr;
        for(;;){
            tempStr = sc.next();
            assert tempStr != null;
            if(tempStr.length() >=20){
                // 删除Trycatch语句和sout语句就为第一题。
                try {
                    throw new MyException("字符串过长");
                }catch (MyException me){
                    System.out.println(me.getMessage());
                }

            }
            if(tempStr.toLowerCase().equals("done")){
                System.out.println("程序结束.....");
                return;
            }
        }
    }
}
