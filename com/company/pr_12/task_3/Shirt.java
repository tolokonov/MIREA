package com.company.pr_12.task_3;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] specifications = str.split(",");
        this.code = specifications[0];
        this.name = specifications[1];
        this.color = specifications[2];
        this.size = specifications[3];
    }

    @Override
    public String toString() {
        return "Shirt: " +
                "code - " + code +
                ", name - " + name +
                ", color - " + color +
                ", size - " + size;
    }
}
