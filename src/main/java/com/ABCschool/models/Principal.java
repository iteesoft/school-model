package com.ABCschool.models;
import com.ABCschool.enums.UserType;
import com.ABCschool.exceptions.UserNotAllowedException;
import com.ABCschool.notifications.EmailSender;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
/**
 * The principal class inherits from staff class
 * and will be used to create the principal of the school.
 */

public class Principal extends User {

    List<Student> studentList;
    private EmailSender emailSender;


    public Principal(String name, String emailAddress, int age, int ID) {
       // super(name, emailAddress, age, ID, UserType.PRINCIPAL);
    }

    public void admitStudent(Applicant applicant, List<Student> studentList) {
        if (applicant.getAge() >= 16) {
            studentList.add(new Student(applicant.getName(), applicant.getEmailAddress(), applicant.getAge(), studentList.size() + 1));
           emailSender.sendTextEmail(applicant.getEmailAddress(),this.getEmailAddress(),"Congratulations " + applicant.getName(), "You have been given a provisional admission.");
        } else {
            emailSender.sendHtmlEmail(applicant.getEmailAddress(),this.getEmailAddress(),"Sorry" + applicant.getName(), "Your application for admission was not successful due to your age.");
        }
    }

    public void expelStudent(Student student) {
        if (!student.isOfGoodConduct()) {
            studentList.remove(student.getID());
            emailSender.sendTextEmail(student.getEmailAddress(), this.getEmailAddress(), "Hello " + student.getName(), "Due to your series of bad conducts, You have been expelled from the school.");
        }

    }
    private void checkIfUserIsPrincipal(User user) {
        if (user.getRole().equals(UserType.PRINCIPAL))
            throw new UserNotAllowedException("You do not have permission to perform this operation!");
    }
}
