package com.atjianyi.demo6;

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
