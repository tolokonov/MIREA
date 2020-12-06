package com.company.pr_16_task_1;

import java.util.HashMap;

public class Order {
    protected HashMap<Dish, Drink> dishesAndDrinks = new HashMap();

    public Order(Dish dish, Drink drink){
        dishesAndDrinks.put(dish, drink);
    }

    @Override
    public String toString() {
        if (dishesAndDrinks.size() == 0)
            return "";
        else
            return String.format("Your order: %s", dishesAndDrinks);
    }

    public boolean isEmpty() {
        return dishesAndDrinks.size() == 0;
    }

    public HashMap<Dish, Drink> getDishesAndDrinks() {
        return dishesAndDrinks;
    }
}
