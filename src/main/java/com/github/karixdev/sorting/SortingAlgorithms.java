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
     * <p>Average time complexity: O(n^2)</p>
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

    /**
     * Link: <a href="https://en.wikipedia.org/wiki/Quicksort">wikipedia page</a>
     * <p>Average time complexity: O(n * log(n))</p>
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        if (arr.length == 0) {
            return;
        }

        _quickSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void _quickSort(T[] arr, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) {
            return;
        }

        int pivot = SortingHelper.partition(arr, lowIdx, highIdx);

        _quickSort(arr, lowIdx, pivot - 1);
        _quickSort(arr, pivot + 1, highIdx);
    }
}
