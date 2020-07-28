package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor()
    {

        //given
        String givenName="jose";
        Long expectedNum=0L;

        //when
        person person=new person(expectedNum,givenName);
        Long actualNum=person.getId();
        String actualWord= person.getName();


        //then
        Assert.assertEquals(expectedNum,actualNum,0);// this test the long
        Assert.assertEquals(givenName,actualWord);


    }
    @Test
    public void testSetName()
    {
        //given
        String expectedName="jose";
        person person =new person(0L,"");

        //when
        person.setName(expectedName);
        String actualName=person.getName();

        //then
        Assert.assertEquals(expectedName,actualName);
    }
}
