package com.company.pr8;

import java.util.Collection;
import java.util.concurrent.*;

public class WaitList<T> implements IWaitList<T>{
    ConcurrentLinkedQueue<T> waitList;

    public WaitList(){
        this.waitList = new ConcurrentLinkedQueue<T>();
    }

    public WaitList(ConcurrentLinkedQueue secondWaitList){
        waitList = secondWaitList;
    }

    @Override
    public void add(T element) {
        this.waitList.add(element);
        return;
    }

    @Override
    public T remove() {
        return this.waitList.remove();
    }

    @Override
    public Boolean contains(T element) {
        return this.waitList.contains(element);
    }

    @Override
    public Boolean containsAll(Collection<T> collection) {
        return this.waitList.containsAll(collection);
    }

    @Override
    public Boolean isEmpty() {
        return this.waitList.isEmpty();
    }

    @Override
    public String toString() {
        return this.waitList.toString();
    }
}
