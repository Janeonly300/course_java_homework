package com.atjianyi.demo07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoTest {
    //202第三题，有16个男子足球队...
    public static void main(String[] args) {
        //使用List存放16足球队
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            list.add("足球队:"+i);
        }
        //再次用List 没四个队伍为一组。
        List<String> groupListOne = new ArrayList<>();
        List<String> groupListTwo = new ArrayList<>();
        List<String> groupListThree = new ArrayList<>();
        List<String> groupListFour = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int rNum = new Random().nextInt(4);
            switch (rNum){
                case 0:
                    if(groupListOne.size()>=4) {
                        i--;
                        continue;
                    }
                    groupListOne.add(list.get(i));
                    break;
                case 1:
                    if(groupListTwo.size()>=4) {
                        i--;
                        continue;
                    }
                    groupListTwo.add(list.get(i));
                    break;
                case 2:
                    if(groupListThree.size()>=4) {
                        i--;
                        continue;
                    }
                    groupListThree.add(list.get(i));
                    break;
                case 3:
                    if(groupListFour.size()>=4) {
                        i--;
                        continue;
                    }
                    groupListFour.add(list.get(i));
                    break;
            }
        }
        groupListOne.forEach(System.out::println);
        System.out.println("==========");
        groupListTwo.forEach(System.out::println);
        System.out.println("===========");
        groupListThree.forEach(System.out::println);
        System.out.println("===========");
        groupListFour.forEach(System.out::println);
    }
}
