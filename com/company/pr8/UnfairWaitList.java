package com.company.pr8;

import java.util.ArrayList;

public class UnfairWaitList<T> extends WaitList<T>{
    ArrayList<T> blackTitle = new ArrayList<>();

    public UnfairWaitList(){
        super();
    }

    public void remove(T element) {
        blackTitle.add(element);
        this.waitList.remove(element);
        return;
    }

    @Override
    public void add(T element) {
        if (blackTitle.contains(element)){
            return;
        }
        super.add(element);
    }

    public void moveToBack(T element){
        this.waitList.remove(element);
        super.add(element);
    }
}
