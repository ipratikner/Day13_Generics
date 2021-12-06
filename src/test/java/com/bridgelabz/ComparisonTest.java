package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {
    // Refactor 1:Refactor all the 3 to One Generic Method and find the maximum
    @Test
    public void givenObjectGenericMethod_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        String max = comparison.largest("Apple", "Peach","Banana");
        Assertions.assertEquals("Peach",max);
    }
}