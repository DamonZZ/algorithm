package com.damon.algorithm.sort;

public class InsertSort {

    public void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
//                if (array[j] < array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//
//                }

            }
            array[j] = temp;
            printArray(array);
        }

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
