package com.company.pr11_tasks;

public class Subtract extends Operations implements Operation{
    @Override
    public int evaluate(int number) {
        if (this.operation1 == null){
            if (this.const_1 == null){
                return number - number;
            } else {
                return number - this.const_1.const_;
            }
        } else {
            if (this.const_1 == null){
                if(this.variable == null){
                    return this.operation1.evaluate(number) - this.operation2.evaluate(number);
                } else {
                    return this.operation1.evaluate(number) - number;
                }
            } else {
                return this.operation1.evaluate(number) - this.const_1.const_;
            }
        }
    }

    Subtract(Operations operation, Const const_){
        this.operation1 = operation;
        this.const_1 = const_;
    }

    Subtract(Const const_, Variable variable){
        this.const_1 = const_;
        this.variable = variable;
    }

    Subtract(Const const_, Operations operation){
        this.operation1 = operation;
        this.const_1 = const_;
    }

    Subtract(Variable variable, Const const_){
        this.const_1 = const_;
        this.variable = variable;
    }

    Subtract(Variable variable, Operations operation){
        this.operation1 = operation;
        this.variable = variable;
    }

    Subtract(Operations operation, Variable variable){
        this.operation1 = operation;
        this.variable = variable;
    }

    Subtract(Operations operation1, Operations operation2){
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    Subtract(Variable variable1, Variable variable2){
        this.variable = variable1;
    }

    Subtract(Const const_1, Const const_2){
        this.const_1 = const_1;
        this.const_2 = const_2;
    }
}
