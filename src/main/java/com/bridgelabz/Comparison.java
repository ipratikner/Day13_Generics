package com.bridgelabz;

public class Comparison {
    public static <T extends Comparable> T largest(T[] elements) {
        T max = elements[0];
        for (T i : elements) {
            // Comparing elements and print which one is maximum.
            if (i.compareTo(max) > 0)
                max = i;
        }
        //Message or maximum array value and print value
        System.out.println("maximum array value " + max);
        return max;
    }


    //
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome To The Geniric Problems");
        //Find Maximum Integer Element From array
        Integer[] integers = {20, 25, 45, 78, 65, 103};
        System.out.println(integers);
    }
}
