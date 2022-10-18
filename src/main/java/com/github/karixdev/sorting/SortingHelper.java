package com.github.karixdev.sorting;

public class SortingHelper {
    public static <T extends Comparable<T>> int partition(T[] arr, int lowIdx, int highIdx) {
        T pivot = arr[highIdx];

        int i = lowIdx - 1;

        /*
        What this for loop does is move any object smaller than pivot to the beginning of an array

        For example:
        having such array: 1 -1 2 0
        then pivot = 0
        and the result is: -1 1 2 0

         */
        for (int j = lowIdx; j < highIdx; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        /*
        Here we move pivot to the position to the right of the last object smaller than pivot
         */
        swap(arr, i + 1, highIdx);

        /*
        Return index of current pivot position
         */
        return i + 1;
    }

    public static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];

        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
