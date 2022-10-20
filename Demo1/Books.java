package com.atjianyi.Demo1;

public class Books {
    private int id; //编号
    private String bookName; //名称
    private double bookPrice; //价格
    private static int nums=1;//书本对象数

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public static int getNums() {
        return nums;
    }

    public static void setNums(int nums) {
        Books.nums = nums;
    }

    public Books(String bookName, double bookPrice) {
        this.id = nums++; //实现编号自增长
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Books() {
        this.id = nums++; //实现编号自增长
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
