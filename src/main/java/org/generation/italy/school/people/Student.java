package org.generation.italy.school.people;

import org.generation.italy.school.administration.Exam;

import java.time.LocalDate;

public class Student {

    private String name, lastname;
    private LocalDate dob;
    private Exam[] exams;

    public Student(String name, String lastname, LocalDate dob, Exam[] exams) {
        this.name = name;
        this.lastname = lastname;
        this.dob = dob;
        this.exams = exams;
    }

    public double calculateAverageGrade(){
        double sum = 0;
        int numExams = 0;
        for(int i = 0; i < exams.length; i++){
            if(exams[i]!=null){
                sum += exams[i].getGrade();
                numExams++;
            }
        }
        if(numExams==0){
            return 0;
        }
        return sum/numExams;
    }


}
