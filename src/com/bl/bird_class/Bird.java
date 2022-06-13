package com.bl.bird_class;

abstract public class Bird {

    String id;
    String name;
    String color;
    int age;

    abstract void eat();

    abstract void fly();

    abstract void swim();

    @Override
    public String  toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
