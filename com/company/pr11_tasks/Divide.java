package com.company.pr11_tasks;

public class Divide extends Operations implements Operation {

    @Override
    public int evaluate(int number) {
        if (this.operation1 == null){
            if (this.const_1 == null){
                return number / number;
            } else {
                return number / this.const_1.const_;
            }
        } else {
            if (this.const_1 == null){
                if(this.variable == null){
                    return this.operation1.evaluate(number) / this.operation2.evaluate(number);
                } else {
                    return this.operation1.evaluate(number) / number;
                }
            } else {
                return this.operation1.evaluate(number) / this.const_1.const_;
            }
        }
    }

    Divide(Operations operation, Const const_){
        this.operation1 = operation;
        this.const_1 = const_;
    }

    Divide(Const const_, Variable variable){
        this.const_1 = const_;
        this.variable = variable;
    }

    Divide(Const const_, Operations operation){
        this.operation1 = operation;
        this.const_1 = const_;
    }

    Divide(Variable variable, Const const_){
        this.const_1 = const_;
        this.variable = variable;
    }

    Divide(Variable variable, Operations operation){
        this.operation1 = operation;
        this.variable = variable;
    }

    Divide(Operations operation, Variable variable){
        this.operation1 = operation;
        this.variable = variable;
    }

    Divide(Operations operation1, Operations operation2){
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    Divide(Variable variable1, Variable variable2){
        this.variable = variable1;
    }

    Divide(Const const_1, Const const_2){
        this.const_1 = const_1;
        this.const_2 = const_2;
    }
}