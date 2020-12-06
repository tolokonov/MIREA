package com.company.pr_12.task_1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Петров",  "Петр",  "Петрович");
        System.out.println(person.getSNM());

        Person person2 = new Person("Зубков");
        System.out.println(person2.getSNM());

        Person person1 = new Person("Дуров", "Павел");
        System.out.println(person1.getSNM());
    }
}
