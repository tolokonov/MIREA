package com.company.pr10_task_1;

public class Test {
    public static void main(String[] args) {
        Complex complex_1;
        Complex complex_2;

        ComplexAbstractFactory concreteFactory_1 = new ConcreteFactory();
        ComplexAbstractFactory concreteFactory_2 = new ConcreteFactory();

        complex_1 = concreteFactory_1.createComplex();
        complex_2 = concreteFactory_2.createComplex(5, -5);

        System.out.println(complex_1.toString() + complex_2.toString());
    }
}
