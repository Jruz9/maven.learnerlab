package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
    Instance;
    private Students students= Students.getInstance();
    private Instructors instructors=Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours)
    {
        teacher.lecture((Learner[]) students.toArray(),numberOfHours);
    }
    public void hostLecture(long id,double numberOfHours)
    {
        person person= instructors.findById(id);
        Instructor instuctor= (Instructor)person;
        instuctor.lecture((Learner[])students.toArray(),numberOfHours);
    }
    public Map<Student,Double>getStudyMap()
    {
        Map<Student,Double> result = new HashMap<>();
        for (person studentAsPerson: students.toArray())
        {
            Student student=(Student)studentAsPerson;
            Double studyTime =student.getTotalTime();
            result.put(student,studyTime);
        }
        return result;
    }

}
