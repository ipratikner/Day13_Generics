package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {
    @Test
    public void givenInteger_ShouldReturnsLargest(){
        Comparison comparison = new Comparison();
        int max = comparison.largest(41,56,23);
        Assertions.assertEquals(56,max);
    }

}