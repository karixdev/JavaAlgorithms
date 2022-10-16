package com.github.karixdev.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface ISortingAlgorithmTest {
    void GivenEmptyList_WhenSort_ThenDoesNothing();
    void GivenNonEmptyIntegerList_WhenSort_ThenSortsElementCorrectly();
    void GivenNonEmptyStringList_WhenSort_ThenSortsElementCorrectly();
}
