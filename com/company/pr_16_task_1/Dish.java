package com.company.pr_16_task_1;

final class Dish implements Item{
    final String name;
    final String description;
    final int cost;
    final int zero = 0;

    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = zero;
    }

    public Dish(int cost, String name, String description){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}