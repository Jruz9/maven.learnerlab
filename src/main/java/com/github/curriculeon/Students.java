package com.github.curriculeon;


import java.util.List;

// Existing independent of an instance of the class that defines it.
public class Students extends People<Student> {


        private static final Students instance = new Students();

        //private constructor to avoid client applications to use constructor
        private Students(){
            super();    //optional invocation
            this.add(new Student(0l,"julia"));
            this.add(new Student(1l,"David Y"));
            this.add(new Student(1l,"Ghassan"));
        }

    @Override
    public Student[] toArray() {    // this implements the generic array to allow our other classes to use it freelly
        int sizeOfArray = count();  // uses the people class Count method to set the array size.
        Student[] destinationArray = new Student[sizeOfArray];  // uses the sizeOfArray to set the array size
        List<Student> sourceList = personList;                  // creates a list that allows students to be parameterized and use the personList generic class
        return sourceList.toArray(destinationArray);            //returns a array of converted  values from the sourcelist using the student array destinationArray  as the new storage
    }

    public static Students getInstance()
        {
            return instance;
        }
}
