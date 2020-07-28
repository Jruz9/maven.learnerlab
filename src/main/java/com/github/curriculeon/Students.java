package com.github.curriculeon;


import java.util.List;

// Existing independent of an instance of the class that defines it.
public class Students extends People {


        private static final Students instance = new Students();

        //private constructor to avoid client applications to use constructor
        private Students(){
            super();    //optional invocation
            this.add(new Student(0l,"julia"));
            this.add(new Student(1l,"David Y"));
            this.add(new Student(1l,"Ghassan"));
        }

    @Override
    public person[] toArray() {
        int sizeOfArray = count();
        Student[] destinationArray = new Student[sizeOfArray];
        List<Student> sourceList = personList;
        return sourceList.toArray(destinationArray);
    }

    public static Students getInstance()
        {
            return instance;
        }
}
