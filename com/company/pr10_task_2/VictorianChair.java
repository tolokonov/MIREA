package com.company.pr10_task_2;

public class VictorianChair implements Chair{
    private static int age;

    public VictorianChair(int age){
        this.age = age;
    }

    public static int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChair: " +
                "age = " + age;
    }

    @Override
    public void sit() {
        System.out.println("Возраст стула: " + getAge());
    }
}
