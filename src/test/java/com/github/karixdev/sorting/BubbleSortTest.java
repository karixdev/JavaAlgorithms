package com.github.karixdev.sorting;

import com.github.karixdev.sorting.helper.SortingTestCasesHolder;
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
        Integer[] arr = SortingTestCasesHolder.integerTestCase.getNonSorted();

        // when
        SortingAlgorithms.bubbleSort(arr);

        // then
        Assertions.assertArrayEquals(
                SortingTestCasesHolder.integerTestCase.getSorted(),
                arr
        );
    }

    @Test
    @Override
    public void GivenNonEmptyStringList_WhenSort_ThenSortsElementCorrectly() {
        // given
        String[] arr = SortingTestCasesHolder.stringTestCase.getNonSorted();

        // when
        SortingAlgorithms.bubbleSort(arr);

        // then
        Assertions.assertArrayEquals(
                SortingTestCasesHolder.stringTestCase.getSorted(),
                arr
        );
    }
}
