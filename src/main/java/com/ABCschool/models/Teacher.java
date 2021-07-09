package com.ABCschool.models;

import com.ABCschool.enums.UserType;
import com.ABCschool.exceptions.CourseNotFound;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString

/**
 * The teacher class inherits from staff class
 * and will be used to create all teachers in the school.
 */
public class Teacher extends User {

    List<Courses> teachersCourseList = new ArrayList<>();

    public Teacher(String name, String emailAddress, int age, int ID) {
        super(name, emailAddress, age, ID, UserType.TEACHER);
    }

    //Teacher
    public void teachACourse(Courses courses) {
        if (teachersCourseList.contains(courses)) {
            System.out.println("Teacher " + this.getName() + " is currently teaching " + courses.getCourseName() + ".\n");
        } else {
            throw new CourseNotFound("Specified course is not available in your list of courses to be taught");
        }
    }
    //Teacher adds course to list of courses he's tp teach
    public void addACourse(Courses courses) {
        teachersCourseList.add(courses);
        System.out.println("Hello " + this.getName() + ", Course with ID-" + courses.getCourseID() + " has been added to the list of courses you are to teach.\n");
    }
}