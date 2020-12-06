package com.company.pr_16_task_1;

public class Test {
    public static void main(String[] args) {
        //task 1
        Drink juice = new Drink("apple juice", "with pulp");
        System.out.println(juice.toString());

        Drink freshJuice = new Drink(3000, "orange juice", "it is fresh");
        System.out.println(freshJuice.getCost());

        //task 2
        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        Dish apple = new Dish("Apple", "tasty");
        tablesOrderManager.createOrder(apple, juice);
        System.out.println(tablesOrderManager.order);
    }
}
