package com.ABCschool.models;

import com.ABCschool.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The applicant class inherits from person class
 * and will be used to create all applicant.
 */

public class Applicant extends User {

    public Applicant(String name, String emailAddress, int age, int ID) {
        super(name, emailAddress, age, ID, UserType.APPLICANT);
    }
}

