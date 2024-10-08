package org.generation.italy.school.hr;

import org.generation.italy.school.people.Student;

public class Analyst {

    public StudentLevel classifyStudent(Student s){
        double average = s.calculateAverageGrade();
        if(average>29){
            return StudentLevel.GURU;
        } else if (average>27) {
            return StudentLevel.EXCELLENT;
        } else if (average>24) {
            return StudentLevel.MEDIOCRE;
        } else {
            return StudentLevel.TERRIBLE;
        }
    }

}
