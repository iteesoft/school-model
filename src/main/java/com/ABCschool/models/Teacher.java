package com.ABCschool.models;

import com.ABCschool.enums.UserType;
import lombok.*;

@Setter
@Getter
@ToString

/**
 * The teacher class inherits from staff class
 * and will be used to create all teachers in the school.
 */
public class Teacher extends User {

    public Teacher(String name, String emailAddress, int age, int ID) {
        super(name, emailAddress, age, ID, UserType.TEACHER);
    }

    public void teachACourse(Courses courses) {
        System.out.println(this.getName() + "is currently teaching " + courses.getCourseName());
    }
}