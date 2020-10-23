package com.company.pr10_task_2;

import java.util.Scanner;

public class FunctionalChair implements Chair{
    public static int sum(int a, int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }

    @Override
    public void sit() {
        System.out.println("Давайте попробуем сесть на функциональный стул");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Стул просит ввести 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Стул отвечает: " + sum(a, b));
    }
}
