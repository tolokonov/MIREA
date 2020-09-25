package com.company.pr6;

public class QuickSort {
    public static void quickSort(Student[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(Student[] array, int left, int right) {
        Student pivot = array[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 1) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right);

        return partitionIndex;
    }

    private static void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}