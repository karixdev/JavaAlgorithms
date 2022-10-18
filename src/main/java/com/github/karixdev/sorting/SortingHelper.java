package com.github.karixdev.sorting;

public class SortingHelper {
    public static <T extends Comparable<T>> int partition(T[] arr, int lowIdx, int highIdx) {
        T pivot = arr[highIdx];

        int i = lowIdx - 1;

        for (int j = lowIdx; j < highIdx; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, highIdx);
        return i + 1;
    }

    public static <T extends Comparable<T>> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];

        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
