package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public void actorDisplayInfo()
    {
        System.out.println("Name=" +name +" "+
                            "Gender=" +gender +" "+
                            "age=" +age);
    }
    //Create setter methods to set the values to varaibles
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
