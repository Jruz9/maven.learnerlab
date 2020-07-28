package com.github.curriculeon;

import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStudents {
    @Test
    public void test()
    {
        Students students =Students.getInstance();
        String[] studentNameArray={"Julia","David Y","Ghassan"};
        List<String> studentNameList=new ArrayList<>(Arrays.asList(studentNameArray));

        person[] studentArray =students.toArray();

    }
}
