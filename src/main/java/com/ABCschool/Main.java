package com.ABCschool;

import com.ABCschool.enums.UserType;
import com.ABCschool.models.*;
import com.ABCschool.notifications.EmailSender;
import com.ABCschool.notifications.impl.MailchimpEmailSender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Applicant> applicantList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        EmailSender emailSender = new MailchimpEmailSender();

        School abcCollege = new School();
        Principal Bond = new Principal("Bond", "bondgee@gmail.com", 16, 111);
       // Teacher Sola = new Teacher("Sola", "sol1@hotmail.com", 35, 211);

        //List<Applicant> applicantList= abcCollege.getApplicantsList();
        //List<Student> studentList = abcCollege.getStudentsList();

       // Student Michael = new Student("Michael", "mic2@gmail.com", 18, 311);
       // Courses Physics = new Courses(522, "Physics", "Science");

        Applicant Bolaji = new Applicant("Bolaji", "bj09@gmail.com", 24,411);
        Applicant Chizy = new Applicant("Chizy", "chiz@gmail.com", 15,412);


        abcCollege.applyForAdmission(Bolaji);
        System.out.println(applicantList.size());

        Bond.admitStudent(Bolaji, studentList);
        System.out.println(studentList.size());

        //Sola.teachACourse(Physics);


    }

}
