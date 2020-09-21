package com.company;

import java.util.Scanner;

public class exercise_test {
    public static void main(String[] args) {
        System.out.println("Тест задачи №7");
        exercise_7_test();
        System.out.println();
        System.out.println("Тест задачи №8");
        exercise_8_test();
        System.out.println();
        System.out.println("Тест задачи №9");
        exercise_9_test();
        System.out.println();
        System.out.println("Тест задачи №10");
        exercise_10_test();
        System.out.println();
        System.out.println("Тест задачи №11");
        exercise_11_test();
    }

    public static void exercise_7_test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для разложения на множетели");
        int n = scanner.nextInt();
        exercise_7.recursion(n, 2);
    }

    public static void exercise_8_test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки полиндрома");
        String s = scanner.nextLine();
        if (exercise_8.recursion(s)) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }

    public static void exercise_9_test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите кол-во нулей и едениц");

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Кол-во возможных комбинаций: " + exercise_9.recursion(n, m));
    }

    public static void exercise_10_test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите число для его записи в обратном порядке");
        int n = scanner.nextInt();
        System.out.println("в обратном порядке: " + exercise_10.recursion(n, 0));
    }

    public static void exercise_11_test(){
        System.out.println("ведите последовательность чисел, закончивающуюся 2 нулями");
        System.out.println(exercise_11.recursion());
    }
}
