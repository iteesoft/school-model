package com.ABCschool.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Courses {
    private int courseID;
    private String courseName;
    private String courseCategory;

}
