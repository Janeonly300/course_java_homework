package com.atjianyi.demo06;

public class MyException extends RuntimeException{
    private String message;
    public MyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
