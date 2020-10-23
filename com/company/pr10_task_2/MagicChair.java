package com.company.pr10_task_2;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("abra-ca-dab-ra");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }

    @Override
    public void sit() {
        System.out.println("Можно и присесть");
        doMagic();
    }
}
