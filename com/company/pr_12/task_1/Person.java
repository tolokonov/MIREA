package com.company.pr_12.task_1;

public class Person {
    private String surname;
    private String name = "не известно";
    private String middleName = "не известно";

    public Person(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public StringBuilder getSNM() {
        return new StringBuilder("Person: " +
                "surname - " + surname +
                ", name - " + name +
                ", middle name - " + middleName);
    }
}
