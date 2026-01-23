package com.billingsystem;

public class NoDishException extends Exception {

    private String message;

    public NoDishException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
