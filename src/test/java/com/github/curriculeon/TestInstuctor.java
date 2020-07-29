package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstuctor {
    @Test
    public void testInheritance() {
        //given

        Instructor instructor = new Instructor(null, null);

        //when
        boolean testInstance = instructor instanceof person;
        //then
        Assert.assertTrue(testInstance);
    }

    @Test
    public void testImplementation() {
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean testInstance = instructor instanceof Teacher;

        //then
        Assert.assertTrue(testInstance);
    }

    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor(null, null);
        Learner learner = new Student(null, null);
        Double totalTaughtTime = 40.0;  // the next 3 lines test variables to see if the method works
        Double preStudyTime = learner.getTotalTime();
        Double expected = preStudyTime + totalTaughtTime;

        //when
        instructor.teach(learner, totalTaughtTime);
        Double actual = learner.getTotalTime();
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture() {
        //given
        Teacher teacher = new Instructor(null, null);
        Learner[] learners = new Learner[]{
                new Student(0L, "Leon"),
                new Student(1L, "Christopher"),
                new Student(2L, "Hunter"),
        };
        Double hours = 40.0;
        Double expected = hours / learners.length;  //a function operation we are testing here b/c it is in the class

        //when
        teacher.lecture(learners, hours);

        //then
        for (Learner learner : learners) {
            Double actual = learner.getTotalTime();
            Assert.assertEquals(expected, actual);
        }
    }
}