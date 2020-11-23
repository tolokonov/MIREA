package com.company.pr_11_task_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("ArrayQueueModule Test");
        ArrayQueueModule.enqueue(5);
        ArrayQueueModule.enqueue(58);
        ArrayQueueModule.enqueue(59);
        ArrayQueueModule.enqueue(591);
        ArrayQueueModule.enqueue(592);
        ArrayQueueModule.enqueue(595);
        System.out.println("elements: " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("element(): " + ArrayQueueModule.element());
        System.out.println("elements after element(): " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("dequeue(): " + ArrayQueueModule.dequeue());
        System.out.println("elements after dequeue(): " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("getSize(): " + ArrayQueueModule.getSize());
        if (ArrayQueueModule.isEmpty()) {
            System.out.println("Empty "  + ArrayQueueModule.getSize());
        } else {
            System.out.println("Not empty "  + ArrayQueueModule.getSize());
        }
        ArrayQueueModule.clear();
        System.out.println("elements after clear(): " + Arrays.toString(ArrayQueueModule.elements));
        if (ArrayQueueModule.isEmpty()) {
            System.out.println("Empty " + ArrayQueueModule.getSize());
        } else {
            System.out.println("Not empty "+ ArrayQueueModule.getSize());
        }
        System.out.println();

        System.out.println("ArrayQueueADT Test");
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueADT.push(arrayQueueADT, 1);
        ArrayQueueADT.push(arrayQueueADT, 2);
        ArrayQueueADT.push(arrayQueueADT, 3);
        ArrayQueueADT.push(arrayQueueADT, 4);
        System.out.println(arrayQueueADT);
        System.out.println("element(): " + ArrayQueueADT.element(arrayQueueADT));
        System.out.println("dequeue(): " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("dequeue(): " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("after dequeue(): " + arrayQueueADT);
        if (ArrayQueueADT.isEmpty(arrayQueueADT)) {
            System.out.println("Empty " + ArrayQueueADT.getSize(arrayQueueADT));
        } else {
            System.out.println("Not empty "+ ArrayQueueADT.getSize(arrayQueueADT));
        }
        ArrayQueueADT.clear(arrayQueueADT);
        if (ArrayQueueADT.isEmpty(arrayQueueADT)) {
            System.out.println("Empty " + ArrayQueueADT.getSize(arrayQueueADT));
        } else {
            System.out.println("Not empty "+ ArrayQueueADT.getSize(arrayQueueADT));
        }
        System.out.println();

        System.out.println("ArrayQueue Test");
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        System.out.println(arrayQueue);
        System.out.println("element(): " + arrayQueue.element());
        System.out.println("dequeue(): " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        if (arrayQueue.isEmpty()) {
            System.out.println("Empty " + arrayQueue.getSize());
        } else {
            System.out.println("Not empty "+ arrayQueue.getSize());
        }
        arrayQueue.clear();
        if (arrayQueue.isEmpty()) {
            System.out.println("Empty " + arrayQueue.getSize());
        } else {
            System.out.println("Not empty "+ arrayQueue.getSize());
        }
    }
}
