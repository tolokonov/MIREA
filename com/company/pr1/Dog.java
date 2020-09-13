package com.company.pr1;
import java.lang.*;

class Dog {
    private String nameOfDog;
    private int age;
    private String type;
    private String color;

    public Dog(String dogName, int age){
        this.nameOfDog = dogName;
        this.age = age;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return nameOfDog;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public void intoHumanAge(){
        System.out.println(nameOfDog + "'s age in human years is " + age * 7 + " years");
    }

    @Override
    public String toString() {
        return  "Dog: " + '\n' +
                "name = " + nameOfDog + '\n' +
                "age = " + age + '\n' +
                "type = " + type + '\n' +
                "color = " + color;
    }
}
