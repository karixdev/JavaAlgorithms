package com.github.karixdev.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingHelperTest {
    @Test
    public void GivenNotEmptyArray_WhenPartition_ThenReturnsCorrectPivotIndex() {
        // given
        Integer[] arr = {1, -1, 2, -2, 45, 0};

        // when
        int result = SortingHelper.partition(arr, 0, arr.length - 1);

        // then
        Assertions.assertEquals(2, result);
    }
}
