package com.company;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobic", 3);
        dog.setType("Sheepdog");
        dog.setColor("black");
        dog.intoHumanAge();
        System.out.println();

        System.out.println(dog.toString());
    }
}
