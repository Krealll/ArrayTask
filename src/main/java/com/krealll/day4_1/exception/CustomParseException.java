package com.krealll.day4_1.exception;

public class CustomParseException extends Exception{

    public CustomParseException(){}

    public CustomParseException(String message) {
        super((message));
    }

    public CustomParseException(Throwable reason) {
        super((reason));
    }

    public CustomParseException(String message, Throwable reason) {
        super(message, reason);
    }
}

