package com.company.pr10_task_2;

public class Test {
    public static void main(String[] args) {
        Chair chair;

        AbstractChairFactory chairFactory = new ChairFactory();
        System.out.println("Давайте попробуем сделать магический стул");

        chair = chairFactory.createMagicalChair();
        System.out.println(chair.toString());
        chair.sit();

        System.out.println();
        System.out.println("Давайте попробуем сделать функциональный стул");

        chair = chairFactory.createFunctionChair();
        System.out.println(chair.toString());
        chair.sit();

        System.out.println();
        System.out.println("Давайте попробуем сделать викторианский стул");

        chair = chairFactory.createVictorianChair();
        System.out.println(chair.toString());
        chair.sit();

        Client client = new Client(chairFactory);
        client.sit();
    }
}
