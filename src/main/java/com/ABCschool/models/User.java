package com.ABCschool.models;

import com.ABCschool.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/**
 * This class is the blueprint or base class to create all users
 * (staff, student and applicant) in the school.
 */
public abstract class User {
    private String name;
    private String emailAddress;
    private int age;
    private int ID;
    private UserType role;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", role=" + role +
                '}';
    }
}
