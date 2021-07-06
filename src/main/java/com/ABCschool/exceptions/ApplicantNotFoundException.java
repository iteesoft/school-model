package com.ABCschool.exceptions;

public class ApplicantNotFoundException extends  RuntimeException{
    private String message;

    public ApplicantNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
