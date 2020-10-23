package com.company.pr10_task_2;

import java.util.Scanner;

public class Client implements Chair{
    public Chair chair;
    public static AbstractChairFactory chairFactory;

    public Client(AbstractChairFactory chairFactory){
        this.chairFactory = chairFactory;
    }

    public void sit(){
        System.out.println("Давайте выберем другой стул");
        setChair(this);
    }

    public static void setChair(Chair chair){
        System.out.println("Для магического стула нажмите - 1");
        System.out.println("Для функционального стула нажмите - 2");
        System.out.println("Для викторианского стула нажмите - 3");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                chair = chairFactory.createMagicalChair();
                chair.sit();
            case 2:
                chair = chairFactory.createFunctionChair();
                chair.sit();
            default:
                chair = chairFactory.createVictorianChair();
                chair.sit();
        }
    }
}
