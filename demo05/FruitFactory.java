package com.atjianyi.demo05;

public class FruitFactory {
    public static Fruit getInstance(String arg){
        if(arg.equals("apple")){
            return new Apple();
        }else if(arg.equals("orange")){
            return new Orange();
        }else{
            throw new RuntimeException("错误");
        }
    }
}
