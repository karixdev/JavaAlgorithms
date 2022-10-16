package com.github.karixdev.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest implements ISortingAlgorithmTest {
    @Test
    @Override
    public void GivenEmptyList_WhenSort_ThenDoesNothing() {
        // given
        Integer[] arr = {};

        // when
        SortingAlgorithms.bubbleSort(arr);

        // then
        Assertions.assertArrayEquals(new Integer[] {}, arr);
    }

    @Test
    @Override
    public void GivenNonEmptyIntegerList_WhenSort_ThenSortsElementCorrectly() {
        // given
        Integer[] arr = {0, -1, 20, 13, 120, 11, 11, 15};

        // when
        SortingAlgorithms.bubbleSort(arr);

        // then
        Assertions.assertArrayEquals(
                new Integer[] {-1, 0, 11, 11, 13, 15, 20, 120},
                arr
        );
    }

    @Test
    @Override
    public void GivenNonEmptyStringList_WhenSort_ThenSortsElementCorrectly() {
        // given
        String[] arr = {"aa", "a", "", "a", "aaaa", "aaa", "aa"};

        // when
        SortingAlgorithms.bubbleSort(arr);

        // then
        Assertions.assertArrayEquals(
                new String[] {"", "a", "a", "aa", "aa", "aaa", "aaaa"},
                arr
        );
    }
}
