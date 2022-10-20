package com.atjianyi.Demo08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class WordDictionary implements Serializable {
    private final Long serialVersionUID=-6590859375776757766L;
    private static final String propertiesPath = "D:\\Code\\Open_Developer\\IdeaProjects\\Demo01\\Demo01\\src\\main\\java\\com\\atjianyi\\Demo08\\path.properties";
    private Map<String,String> words = new HashMap<>();
    {
    }

    public WordDictionary(){}

    public void readFromFile(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Code\\Open_Developer\\IdeaProjects\\Demo01\\Demo01\\src\\main\\java\\com\\atjianyi\\Demo08\\text.txt"));
            if(objectInputStream == null){
                return;
            }
            WordDictionary a =(WordDictionary) objectInputStream.readObject();
            this.setWords(a.words);
        } catch (IOException | ClassNotFoundException e) {
            return;
        } finally {
            if(objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void savaToFile(){
        System.out.println("正在保存...");
        File  file = new File("D:\\Code\\Open_Developer\\IdeaProjects\\Demo01\\Demo01\\src\\main\\java\\com\\atjianyi\\Demo08\\text.txt");
        ObjectOutputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectInputStream.writeObject(this); //序列化对象
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void listAllWords(){
        for (String key:
             words.keySet()) {
            System.out.println(key+" means："+words.get(key));
        }
    }

    /**
     * 删除单词
     * @param word
     * @return
     */
    public String deleteWord(String word){
        String remove = words.remove(word);
        return remove;
    }
    /**
     * 查询意思
     * @param word
     * @return
     */
    public String search(String word){
        String s = word.toLowerCase();
        return words.get(s);
    }

    /**
     * 保存单词和意思
     * @param word
     * @param expaintion
     * @return
     */
    public Boolean save(String word,String expaintion){
        if(word == null || "".equals(word) || expaintion==null||"".equals(expaintion)){
            return false;
        }
        String s = word.toLowerCase();
        words.put(s,expaintion);
        savaToFile();
        return true;
    }

    public Map<String, String> getWords() {
        return words;
    }

    public void setWords(Map<String, String> words) {
        this.words = words;
    }
}
