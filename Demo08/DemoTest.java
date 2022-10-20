package com.atjianyi.Demo08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DemoTest {
    private static Scanner sc= new Scanner(System.in);
    private static WordDictionary wordDictionary = new WordDictionary();
    public static void main(String[] args) throws InterruptedException {
        init();
    }
    static void addWordWithExplain(){
        System.out.println("请输入要添加的单词");
        String s1 = sc.next();
        System.out.println("请输入注释");
        String s2 = sc.next();
        //保存
        wordDictionary.save(s1,s2);
    }

    static void init() throws InterruptedException {
        //初始化数据

        wordDictionary.readFromFile();
        while (true){
            mainMune();

            String op = sc.next();
            switch (op){
                case "1":
                    System.out.println("查询成功:");
                    wordDictionary.listAllWords();
                    System.out.println("=====================");
                    break;
                case "2":
                    selectWord();
                    break;
                case "3":
                    deleteWord();
                    break;
                case "4":
                    addWordWithExplain();
                    System.out.println("添加成功！");
                    System.out.println("======================");
                    break;
                case "5":
                    System.out.println("拜拜小朋友...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("再考虑一下好好输入...");
            }

            System.out.println("输入a返回");
            sc.next();
        }
    }

    private static void deleteWord() {
        wordDictionary.listAllWords();
        System.out.println("请输入您要删除单词的名字");
        String next = sc.next();
        String s = wordDictionary.deleteWord(next);
        if(s!=null){
            System.out.println("删除"+s+"成功！");
        }else{
            System.out.println("删除失败，请检查您要删除的单词");
        }
    }

    /**
     * 查询单词
     */
    private static void selectWord() {
        System.out.println("请输入您要查询的单词");
        String next = sc.next();
        String search = wordDictionary.search(next);
        if(search==null){
            //查询失败
            System.out.println("查询失败。。返回菜单....");
            return;
        }
        System.out.println(next+"意思是: "+search);
    }

    static void mainMune(){
        System.out.println("        欢迎来到快乐字典            ");
        System.out.println("*********************************");
        System.out.println("          1. 查询所有       ");
        System.out.println("          2. 查询单词       ");
        System.out.println("          3. 删除单词       ");
        System.out.println("          4. 添加单词到词典中 ");
        System.out.println("          5. 退出游戏        ");
        System.out.println("*********************************");
    }
}
