package com.ABCschool.models;
import com.ABCschool.enums.UserType;
import com.ABCschool.exceptions.ApplicantTooYoungException;
import com.ABCschool.exceptions.UserNotAllowedException;
import com.ABCschool.notifications.EmailSender;
import com.ABCschool.notifications.impl.MailchimpEmailSender;
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

    List<Student> studentList = new ArrayList<>();

    // The Emailsender interface will be used to notify the students.
    private EmailSender emailSender = new MailchimpEmailSender();


    public Principal(String name, String emailAddress, int age, int ID) {
        super(name, emailAddress, age, ID, UserType.PRINCIPAL);
    }
    /*Admit applicant based on age, if above 16 -admit,
    * if below 16 -deny*/
    public void admitStudent(Applicant applicant) {
        if (applicant.getAge() >= 16) {
            studentList.add(new Student(applicant.getName(), applicant.getEmailAddress(), applicant.getAge(), studentList.size() + 1));
           emailSender.sendTextEmail(applicant.getEmailAddress(), this.getEmailAddress(),"Congratulations " + applicant.getName() + "!,", "You have been given a provisional admission.\n");

        } else {
            emailSender.sendHtmlEmail(applicant.getEmailAddress(), this.getEmailAddress(),"Sorry" + applicant.getName() + "!,", "Your application for admission was not successful due to your age.\n");
            throw new ApplicantTooYoungException("Applicant with name " +applicant.getName() + " is too young to be admitted" );
        }
    }
    /*Expel student based on misconduct*/
    public void expelStudent(Student student) {
        if (!student.isOfGoodConduct()) {
            studentList.remove(student);
            emailSender.sendTextEmail(student.getEmailAddress(), this.getEmailAddress(), "Hello " + student.getName() + "!,", "Due to your series of misconducts, You have been expelled from this school.\n");
        }
    }

    public Student getStudentById(int id) {
        return studentList.stream().filter(student -> student.getID() == id).findFirst().get();
    }

    private void checkIfUserIsPrincipal(User user) {
        if (user.getRole().equals(UserType.PRINCIPAL))
            throw new UserNotAllowedException("You do not have permission to perform this operation!");
    }
}
