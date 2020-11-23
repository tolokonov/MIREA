package com.company.pr11_tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable('x')), new Const(3)).evaluate(5));
        System.out.println("Введите значение переменной x");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(new Add(new Subtract(new Multiply(new Variable('x'), new Variable('x')), new Multiply(new Const(2), new Variable('x'))), new Const(1)).evaluate(number));
    }
}
