package com.ABCschool.exceptions;

public class UserNotAllowedException extends RuntimeException{
    private String message;

    public UserNotAllowedException(String message) {
        super(message);
        this.message = message;
    }
}
