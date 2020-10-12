package com.company.pr7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для реализации задачи через Stack, введите 1");
        System.out.println("Для реализации задачи через Queue, введите 2");
        System.out.println("Для реализации задачи через Dequeue, введите 3");
        System.out.println("Для реализации задачи через DoubleList, введите 4");
        int chosenVar = scanner.nextInt();
        switch (chosenVar){
            case 1:
                stack();
                break;
            case 2:
                queue();
                break;
            case 3:
                dequeue();
                break;
            default:
                doubleList();
                break;
        }
    }

    public static void stack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Stack<Integer> cards_1 = new Stack<>();
        for (int i=0; i<cards_st.length; i++){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Stack <Integer> cards_2 = new Stack<>();
        System.out.println("Введите 5 карт второго игрока (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=0; i<cards_st.length; i++){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Stack_.play(cards_1, cards_2));
    }

    public static void queue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Queue<Integer> cards_1 = new LinkedList<>();
        for (int i=cards_st.length - 1; i>=0; i--){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Queue<Integer> cards_2 = new LinkedList<>();
        System.out.println("Введите 5 карт второго игрока (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=cards_st.length - 1; i>=0; i--){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Queue_.play(cards_1, cards_2));
    }

    public static void dequeue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Deque<Integer> cards_1 = new LinkedList<>();
        for (int i=cards_st.length-1; i>=0; i--){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Deque<Integer> cards_2 = new LinkedList<>();
        System.out.println("Введите 5 карт второго игрока (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=cards_st.length-1; i>=0; i--){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Dequeue_.play(cards_1, cards_2));
    }

    public static void doubleList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        LinkedList<Integer> cards_1 = new LinkedList<>();
        for (int i=0; i<cards_st.length; i++){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        LinkedList <Integer> cards_2 = new LinkedList<>();
        System.out.println("Введите 5 карт второго игрока (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=0; i<cards_st.length; i++){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Double_List.play(cards_1, cards_2));
    }
}
