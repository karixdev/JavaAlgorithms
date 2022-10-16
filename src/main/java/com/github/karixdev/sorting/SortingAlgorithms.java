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

    /**
     * Link: <a href="https://en.wikipedia.org/wiki/Selection_sort">wikipedia page</a>
     * Average time complexity: O(n^2)
     */
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minItemIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minItemIdx].compareTo(arr[j]) > 0) {
                    minItemIdx = j;
                }
            }

            T temp = arr[minItemIdx];
            arr[minItemIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
