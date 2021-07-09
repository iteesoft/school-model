package com.ABCschool.exceptions;

public class CourseNotFound extends RuntimeException{
        public CourseNotFound(String message) {
            super(message);
        }
}
