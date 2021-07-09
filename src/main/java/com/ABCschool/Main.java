package com.ABCschool;

import com.ABCschool.enums.UserType;
import com.ABCschool.models.*;
import com.ABCschool.notifications.EmailSender;
import com.ABCschool.notifications.impl.MailchimpEmailSender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Creating a school, principal and teacher object*/
        School abcCollege = new School();
        Principal P1 = new Principal("Bond", "bondgee@gmail.com", 16, 111);
        Teacher T1 = new Teacher("Sola", "sol1@hotmail.com", 35, 211);

        //creating courses objects
        Courses C1 = new Courses(522, "Physics", "Science");
        Courses C2 = new Courses(123, "Chemistry", "Science");

        //creating applicants
        Applicant Ap1 = new Applicant("Bolaji", "bj09@gmail.com", 24,411);
        Applicant Ap2 = new Applicant("Chizy", "chiz@gmail.com", 15,412);
        Applicant Ap3 = new Applicant("Wale", "wal3@gmail.com", 16,413);


        /*School operation begins
        applicants applying for admission*/
        abcCollege.applyForAdmission(Ap1);
        abcCollege.applyForAdmission(Ap2);
        abcCollege.applyForAdmission(Ap3);

        //principal checking the list of applicants
        System.out.println("List of Applicants seeking admission at abc school: " + abcCollege.getApplicantList() + "\n");

        /*principal admitting applicants
        one admitted and the other denied*/
        P1.admitStudent(Ap1);
        P1.admitStudent(Ap3);

        //List of students after admission
        System.out.println("\nThe list of students in abcSchool after admission :" + P1.getStudentList() + "\n");

        //student denied admission due to being underage
        //P1.admitStudent(Ap2);

        //principal retrieving list of students by ID
        Student Wale = P1.getStudentById(2);
        Student Bolaji = P1.getStudentById(1);


        //Student registering for course so he can take it
        Bolaji.takeCourse(C1);
        Bolaji.takeCourse(C2);

        //Displaying list of student courses
        System.out.println("Dear " + Bolaji.getName() + ", your registered courses are :" + Bolaji.getCourses() + "\n");

        //Teacher adding a course so he can teach
        T1.addACourse(C1);
        T1.addACourse(C2);
        T1.teachACourse(C2);

        //Wale is of bad conduct
        Wale.setOfGoodConduct(false);

        //principal expels him
        P1.expelStudent(Wale);


        //list of students in the school after expelling Wale
        System.out.println("\nUpdated List of admitted student: " + P1.getStudentList() + "\n");


    }

}
