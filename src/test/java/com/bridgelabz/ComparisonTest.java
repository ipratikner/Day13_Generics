package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {
    Comparison comparison = new Comparison();
    //UC4 :Extend the max method to take more then three parameters
    @Test
    public void givenThreeNumber_AndFirstNumber_ShouldReturnsLargest_True() {
        Integer [] integers = {14,5,3,6,8};
        Integer max = comparison.largest(integers);
        Assertions.assertEquals(Integer.valueOf(14),max);
    }
}