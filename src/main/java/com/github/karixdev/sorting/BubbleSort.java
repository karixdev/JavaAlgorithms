package com.github.karixdev.sorting;

import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sorting<T>{
    @Override
    public void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
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
