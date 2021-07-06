package com.ABCschool.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class School {

    private List<Student> studentsList;
    private List<Applicant> applicantList;
    private List<Teacher> teachersList;

    private Principal principal;

    public School(Principal principal, List<Student> studentsList, List<Applicant> applicantList) {
        this.principal = principal;
        this.studentsList = studentsList;
        this.applicantList = applicantList;
    }

    public School() {
    }

    public void applyForAdmission(Applicant applicant) {
    this.applicantList.add(applicant);
    }

    public void apply(Applicant applicant) {
        for (int i = 0; i < applicantList.size(); i++) {
            this.principal.admitStudent(applicantList.get(i), this.studentsList);
        }
    }
}

