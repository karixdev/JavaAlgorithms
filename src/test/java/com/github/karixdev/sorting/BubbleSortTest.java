package com.github.karixdev.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BubbleSortTest {

    private final BubbleSort<Integer> integerBubbleSort = new BubbleSort<>();
    private final BubbleSort<String> stringBubbleSort = new BubbleSort<>();

    @Test
    public void GivenEmptyList_WhenSort_ThenReturnsEmptyList() {
        // given
        List<Integer> list = List.of();

        // when
        List<Integer> result = integerBubbleSort.sort(list);

        // then
        Assertions.assertEquals(list, result);
    }

    @Test
    public void GivenNonEmptyIntegerList_WhenSort_ThenReturnsValidlySortedList() {
        // given
        List<Integer> list = List.of(0, -1, 20, 13, 120, 11, 11, 15);

        // when
        List<Integer> result = integerBubbleSort.sort(list);

        // then
        Assertions.assertEquals(
                List.of(-1, 0, 11, 11, 13, 15, 20, 13),
                result
        );
    }

    @Test
    public void GivenNonEmptyStringList_WhenSort_ThenReturnsValidlySortedList() {
        // given
        List<String> list = List.of("aa", "a", "", "a", "aaaa", "aaa", "aa");

        // when
        List<String> result = stringBubbleSort.sort(list);

        // then
        Assertions.assertEquals(
                List.of("", "a", "a", "aa", "aa", "aaa", "aaaa"),
                result
        );
    }
}
