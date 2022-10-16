package com.github.karixdev.sorting.helper;

import java.util.List;

public class SortingTestCasesHolder {
    public static SortingTestCase<Integer> integerTestCase = SortingTestCase.<Integer>builder()
            .nonSorted(new Integer[]{0, -1, 20, 13, 120, 11, 11, 15})
            .sorted(new Integer[]{-1, 0, 11, 11, 13, 15, 20, 120})
            .build();

    public static SortingTestCase<String> stringTestCase = SortingTestCase.<String>builder()
            .nonSorted(new String[]{"aa", "a", "", "a", "aaaa", "aaa", "aa"})
            .sorted(new String[]{"", "a", "a", "aa", "aa", "aaa", "aaaa"})
            .build();
}
