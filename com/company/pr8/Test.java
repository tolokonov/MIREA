package com.company.pr8;

public class Test {
    public static void main(String[] args) {
        WaitList basketOfBalls = new WaitList();
        Balls temp = new Balls();

        for (int i=0; i<10; i++){
            Balls ball = new Balls(i);
            if (i==5){
                temp = ball;
            }
            basketOfBalls.add(ball);//проверка метода add
        }

        basketOfBalls.remove(); //проверка метода remove

        System.out.println("Проверка метода contains()");
        if (basketOfBalls.contains(temp)){
            System.out.println("Элемент temp есть в списке");
        } else {
            System.out.println("Элемент temp нету в списке");
        }

        System.out.println("Проверка метода toString()");
        System.out.println(basketOfBalls.toString());

        System.out.println("Проверка метода isEmpty()");
        if (basketOfBalls.isEmpty()){
            System.out.println("Коллекция пустая");
        } else {
            System.out.println("В коллекции полно элементов");
        }

        //проверка коллекции BoundedWaitList
        BoundedWaitList boundedBasketOfBalls = new BoundedWaitList(9);

        for (int i=0; i<10; i++){
            Balls ball = new Balls(i+10);
            if (i==10){
                temp = ball;
            }
            boundedBasketOfBalls.add(ball);//проверка метода add
        }

        System.out.println("Проверка метода remove()");
        boundedBasketOfBalls.remove();

        System.out.println("Проверка метода contains()");
        if (boundedBasketOfBalls.contains(temp)){
            System.out.println("Элемент temp есть в списке");
        } else {
            System.out.println("Элемент temp нету в списке");
        }

        System.out.println("Проверка метода toString()");
        System.out.println(boundedBasketOfBalls.toString());

        System.out.println("Проверка метода getCapacity()");
        System.out.println("Размер коллекции: " + boundedBasketOfBalls.getCapacity());

        //проверка коллекции UnfairWaitList
        UnfairWaitList unFairBasketOfBalls = new UnfairWaitList();

        for (int i=0; i<10; i++){
            Balls ball = new Balls(i+10);
            if (i==6){
                temp = ball;
            }
            unFairBasketOfBalls.add(ball);//проверка метода add
        }

        System.out.println("Проверка метода remove() для" + temp.toString());
        unFairBasketOfBalls.remove(temp);

        System.out.println("Проверка метода contains()");
        if (unFairBasketOfBalls.contains(temp)){
            System.out.println("Элемент temp есть в списке");
        } else {
            System.out.println("Элемент temp нету в списке");
        }

        unFairBasketOfBalls.add(temp);//проверка add

        System.out.println("Проверка метода toString()");
        System.out.println(unFairBasketOfBalls.toString());
    }
}
