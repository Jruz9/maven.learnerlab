package com.github.curriculeon;

import java.util.List;

public class Instructors extends People<Instructor> {
    private static  final Instructors instance = new Instructors();
    public Instructors()
    {
        super();
        this.add(new Instructor(0L,"leon"));
        this.add(new Instructor(1L,"Haseeb"));
    }

    @Override
    public Instructor[] toArray() {
        int sizeOfArray = count();  // this calls the method in the people class to count the personList generic
        Instructor[] destinationArray = new Instructor[sizeOfArray];    // make an array for the people who are instuctors
        List<Instructor> sourceList = personList;   //Make a list that accepts Instructors
        return sourceList.toArray(destinationArray);    //returns a array represenation of Instuctor list sourceList
    }

    public static Instructors getInstance()
    {
        return instance;
    }
}
