package com.bl.bird_class;

public class Duck extends Bird {

    @Override
    void eat() {
        System.out.println("Duck can eat.");
    }

    @Override
    void fly() {
        System.out.println("Duck cannot  fly.");
    }


    @Override
    void swim() {
        System.out.println("Duck can swim.");
    }

   /* @Override
    public String toString() {
        return "Duck{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }*/
}