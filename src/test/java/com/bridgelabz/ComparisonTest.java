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
    @Test
    //TC1.1 Ensure the test data has Max Number in the First position
    public void givenInteger_AndFirstNumberIsMax_ShouldReturn_true() {
        Comparison comparison = new Comparison();
        int max =  comparison.largest(555, 104, 180);
        Assertions.assertEquals(555, max);
    }
}