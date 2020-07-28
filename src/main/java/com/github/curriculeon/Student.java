package com.github.curriculeon;

public class Student extends person implements Learner {
    private Double totalStudyTime;
    public Student(long id, String name){
        super( id, name);

    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime=totalStudyTime+numberOfHours;
    }

    @Override
    public double getTotalTime() {
        return totalStudyTime;
    }
}
