package com.bridgelabz;

public class Comparison {
    public Comparison() {

    }
    //To find largest number among three Integer
    public static Integer largest(Integer x, Integer y, Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    //To find largest number among three Float
    public static Float largest(Float x, Float y, Float z){
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    //To find largest number among three Float
    public static String largest(String x, String y, String z){
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    //Refactor 1 :Ensure the Generic Type extends Comparable
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome To The Geniric Problems");
        //compaaring maximum value Integer
        Integer xInt = 20;
        Integer yInt = 451;
        Integer zInt = 68;
        Integer max = new Comparison().largest(xInt,yInt,zInt);
        System.out.println("The Largest Interger is ==> "+max);

        //compaaring maximum value Float
        Float xFloat = 2.0f;
        Float yFloat = 4.5f;
        Float zFloat = 6.8f;
        Float max1 = new Comparison().largest(xFloat,yFloat,zFloat);
        System.out.println("The Largest Float is ==> "+max1);

        //compaaring maximum value String
        String xString = "Apple";
        String yString = "Peach";
        String zString = "Banana";
        String max2 = new Comparison().largest(xString,yString,zString);
        System.out.println("The Largest Float is ==> "+max2);

        System.out.println(max);
    }
}
