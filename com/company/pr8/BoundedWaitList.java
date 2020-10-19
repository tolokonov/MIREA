package com.company.pr8;

public class BoundedWaitList<T> extends WaitList<T>{
    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    @Override
    public void add(T element) {
        if (this.waitList.size() == this.capacity){
            System.out.println("превышен лимит новых элеиентов (capacity)");
            return;
        } else {
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return this.waitList.toString() +
                " capacity = " + capacity;
    }
}
