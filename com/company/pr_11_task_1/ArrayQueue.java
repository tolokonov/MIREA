package com.company.pr_11_task_1;

import java.util.Arrays;

public class ArrayQueue {

    private int size;
    private Object[] elements = new Object[1];

    public void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size+1);
        elements[size++] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[capacity];
        if (size >= 0) System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public Object element() {
        assert size > 0;
        return elements[0];
    }

    public Object dequeue() {
        assert size > 0;
        Object temp = elements[0];
        Object[] newElements = new Object[size-1];
        System.arraycopy(elements, 1, newElements, 0, size - 1);
        elements = newElements;
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[0];
        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
