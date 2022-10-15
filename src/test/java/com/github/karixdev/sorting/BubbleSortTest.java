package com.github.karixdev.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BubbleSortTest {

    private final BubbleSort<Integer> integerBubbleSort = new BubbleSort<>();
    private final BubbleSort<String> stringBubbleSort = new BubbleSort<>();

    @Test
    public void GivenEmptyList_WhenSort_ThenDoesNothing() {
        // given
        List<Integer> list = List.of();

        // when
        integerBubbleSort.sort(list);

        // then
        Assertions.assertEquals(List.of(), list);
    }

    @Test
    public void GivenNonEmptyIntegerList_WhenSort_ThenSortsElementCorrectly() {
        // given
        List<Integer> list = List.of(0, -1, 20, 13, 120, 11, 11, 15);

        // when
        integerBubbleSort.sort(list);

        // then
        Assertions.assertEquals(
                List.of(-1, 0, 11, 11, 13, 15, 20, 13),
                list
        );
    }

    @Test
    public void GivenNonEmptyStringList_WhenSort_ThenSortsElementCorrectly() {
        // given
        List<String> list = List.of("aa", "a", "", "a", "aaaa", "aaa", "aa");

        // when
        stringBubbleSort.sort(list);

        // then
        Assertions.assertEquals(
                List.of("", "a", "a", "aa", "aa", "aaa", "aaaa"),
                list
        );
    }
}
