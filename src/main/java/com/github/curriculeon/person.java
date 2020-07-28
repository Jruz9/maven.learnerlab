package com.github.curriculeon;

public class person {
    private final Long id;
    private String name ="";



    public person(long id, String name)
    {
            this.id=id;
            this.name=name;

    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
