package com.company.pr9_task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Check_INN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        ArrayList<Long> map = new ArrayList<>();
        System.out.println("Для выхода из программа введите exit в графе имя");

        while (true){
            System.out.println("Введите имя");
            name = scanner.next();
            if (name.equals("exit")){
                break;
            }
            try {
                System.out.println("Введите свой ИНН из 12 цифр");
                long INN = scanner.nextLong();
                double num = Math.ceil(Math.log10(INN));
                if (num != 12.0){
                    throw new NumbersOf_INN("Неверно введен ИНН, транзакция не прошла успешно");
                }
                if (map.contains(INN)){
                    throw new Unique_INN("Такой ИНН уже есть в базе, транзакция не прошла успешно");
                }
                map.add(INN);
            } catch (NumbersOf_INN e){
                throw new NumbersOf_INN("Неверно введен ИНН, транзакция не прошла успешно");
            } catch (Unique_INN e){
                throw new Unique_INN("Такой ИНН уже есть в базе, транзакция не прошла успешно");
            }
        }
    }
}

class NumbersOf_INN extends RuntimeException{
    public NumbersOf_INN(String errorMessage){
        super(errorMessage);
    }
}

class Unique_INN extends RuntimeException{
    public Unique_INN(String errorMessage){
        super(errorMessage);
    }
}
