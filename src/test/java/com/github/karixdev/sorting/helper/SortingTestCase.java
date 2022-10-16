package com.github.karixdev.sorting.helper;

import lombok.*;

@Builder
@Value
public class SortingTestCase<T extends Comparable<T>> {
    T[] nonSorted;
    T[] sorted;
}
