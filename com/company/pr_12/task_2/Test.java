package com.company.pr_12.task_2;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();

        address.setAddress1("Россия,Рязанская область,Касимов,Повелецкая,5,1,34");
        System.out.println(address);

        address.setAddress2("Россия.Московская область,Одинцово;Весенняя.1,3;22");
        System.out.println(address);

        address.setAddress1("Россия,Псковская область,Псков,Кичина,4,1,54");
        System.out.println(address);

        address.setAddress2("Россия.Мурманская область,Мурманск;Зеленая.45,3;12");
        System.out.println(address);
    }
}
