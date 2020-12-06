package com.company.pr_12.task_3;

public class Test {
    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] newShirts = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            newShirts[i] = new Shirt(shirts[i]);
        }
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(newShirts[i]);
        }
    }
}