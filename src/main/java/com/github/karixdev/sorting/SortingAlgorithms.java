package com.github.karixdev.sorting;

public class SortingAlgorithms {
    /**
     * Link: <a href="https://en.wikipedia.org/wiki/Bubble_sort">wikipedia page</a>
     * <p>Average time complexity: O(n^2)</p>
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)  {
                T current = arr[j];
                T next = arr[j + 1];
                if (current.compareTo(next) > 0) {
                    arr[j] = next;
                    arr[j + 1] = current;
                }
            }
        }
    }
}
