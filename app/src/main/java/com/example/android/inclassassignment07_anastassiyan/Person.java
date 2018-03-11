package com.example.android.inclassassignment07_anastassiyan;

import java.io.Serializable;

/**
 * Created by anastasianossal on 3/6/18.
 */

public class Person implements Serializable {
    String name;
    int age;
    boolean glasses;


    public Person(String name, int age, boolean glasses) {
        this.name = name;
        this.age = age;
        this.glasses = glasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGlasses() {
        return glasses;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    @Override
    public String toString() {
        return "Name is: " + name + "\nAge is: " + age + "\nWearing glasses: " + glasses + "\n";
    }
}

