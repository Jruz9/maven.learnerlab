package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    Instance;
    private final Students students= Students.getInstance();
    private final Instructors instructors=Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours)
    {
        teacher.lecture( students.toArray(),numberOfHours);//before there was casting on this
        // but now that we have the gerneic in the People.java parametization in students and instuctors we dont need casting anymore
    }
    public void hostLecture(long id,double numberOfHours)
    {
        Teacher instructor =instructors.findById(id);           //uses the Teaher defined instuctor and uses it id to find the id and then put the lecturre students and number of hours
        instructor.lecture(students.toArray(),numberOfHours);
    }
    public Map<Student,Double>getStudyMap()
    {
        Map<Student,Double> result = new HashMap<>();
        for (Student student: students.toArray())   //since students is a generiic we can go though the array without casting and apply the hours of stuty for each student
        {
            Double studyTime =student.getTotalTime();
            result.put(student,studyTime);
        }
        return result;
    }

}
