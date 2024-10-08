package org.generation.italy.school.administration;

public class Exam {

    private String title, area;
    private int grade;

    public Exam(int grade, String area, String title) {
        this.grade = grade;
        this.area = area;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getGrade() {
        return grade;
    }

}
