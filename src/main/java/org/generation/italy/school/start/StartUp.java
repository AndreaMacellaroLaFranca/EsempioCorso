package org.generation.italy.school.start;

import org.generation.italy.school.administration.Exam;
import org.generation.italy.school.hr.Analyst;
import org.generation.italy.school.hr.StudentLevel;
import org.generation.italy.school.people.Student;

import java.time.LocalDate;

public class StartUp {
    public static void main(String[] args) {

        Exam e1 = new Exam(30,"IT", "Java");
        Exam e2 = new Exam(30, "SoftSkill","hr");

        Student s = new Student("Andrea", "Macellaro La Franca", LocalDate.of(2000, 05, 03), new Exam[]{e1,e2});

        Analyst a = new Analyst();

        StudentLevel level = a.classifyStudent(s);
        System.out.println(level);
    }
}
