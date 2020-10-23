package com.company.pr10_task_1;

class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex(){
        return new Complex();
    }

    public Complex createComplex(int real, int image){
        return new Complex(real, image);
    }
}
