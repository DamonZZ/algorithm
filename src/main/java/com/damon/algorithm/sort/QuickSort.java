package com.damon.algorithm.sort;

public class QuickSort {

    public void quickSort(int[] array, int start, int end) {
        if (start >= end) return;

        int left = start;
        int right = end;
        int base = array[left];
        while (left < right) {
            while (left < right && array[right] >= base) {
                right--;
            }
            while (left < right && array[left] <= base) {
                left++;
            }

            if (left < right) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }
        }

        array[start] = array[left];
        array[left] = base;

        printArray(array);

        quickSort(array, start, left - 1);
        quickSort(array, left + 1, end);
    }

    private void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println("array = " + sb.toString());
    }

}
