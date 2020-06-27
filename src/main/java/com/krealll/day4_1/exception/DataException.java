package com.krealll.day4_1.exception;

public class DataException extends Exception {

    public DataException(){}

    public DataException(String message) {
        super((message));
    }

    public DataException(Throwable reason) {
        super((reason));
    }

    public DataException(String message, Throwable reason) {
        super(message, reason);
    }
}
