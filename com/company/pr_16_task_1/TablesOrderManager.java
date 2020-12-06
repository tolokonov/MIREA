package com.company.pr_16_task_1;

public class TablesOrderManager {
    Order order;

    public void createOrder(Dish dish, Drink drink){
        Order order = new Order(dish, drink);
        this.order = order;
    }

    public void deleteOrder(Dish dish, Drink drink){
        this.order.dishesAndDrinks.clear();
        this.order = null;
    }
}
