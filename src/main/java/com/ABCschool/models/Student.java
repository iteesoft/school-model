package com.ABCschool.models;


import com.ABCschool.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * The student class was created from person class through inheritance
 * and will be used to create all students in the school.
 */

@Getter
@Setter
public class Student extends User {

    private List<Courses> coursesList = new ArrayList<>();
    private boolean isOfGoodConduct;

    public Student(String name, String emailAddress, int age, int ID) {
        super(name, emailAddress, age, ID, UserType.STUDENT);
    }


    public void displayStudentDetails() {
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() + ", StudentID " + this.getID());
    }

    public String takeCourse(Courses courses) {
        coursesList.add(courses);
        return "Course with course ID " + courses.getCourseID() + " successfully taken and added to you list of courses\n";
    }

    public List<Courses> getCourses() {
        return coursesList;
    }

    @Override
    public String toString() {
        return "{" + "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", ID=" + this.getID() +
                '}';
    }
}