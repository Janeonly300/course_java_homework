package com.atjianyi.demo2;

public class Student  {
    private  String name;
    private int age;

    public Student(){
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age >=200 && age<0){
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        String str = "name="+this.name +" age="+this.age;
        return str;
    }
}
