package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

abstract public class People <somePersonType extends person> implements Iterable<somePersonType>{       // declation ad implemernt
        List<somePersonType>personList;  //Instantiate means to  represents a instance of an object before equals is a declareation
                                                // just making a objewct tldr

    public People(){

        this(new ArrayList<>());
    }
    public People(List<somePersonType> personList)
    {
      this.personList =personList;
    }


    public void add(somePersonType persons)
    {
       this.personList.add(persons);
    }

    public somePersonType findById(long id)
    {
        for (somePersonType persons:personList)
        {
            if (persons.getId()==id)
            {
                return persons;
            }
            else
            {
                continue;
            }
        }
        return null;    // if we were not able to return the id or find the id

    }

    public boolean contains(somePersonType specifiedPersons)
    {
        return personList.contains(specifiedPersons);
    }

    public void remove(somePersonType person)
    {
        personList.remove(person);
    }
    public void removeAll()
    {
        personList.clear();

//        for(person person:personList)
//        {
//            personList.remove(person);
//        }
    }
    public int count()
    {
        return personList.size();
    }

    abstract public somePersonType[] toArray();


    @Override
    public Iterator<somePersonType> iterator()
    {
        return personList.iterator();
    }

}
