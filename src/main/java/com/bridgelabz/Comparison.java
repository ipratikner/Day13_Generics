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
        Float yFloat = 4.51f;
        Float zFloat = 6.8f;
        Float max1 = new Comparison().largest(xFloat,yFloat,zFloat);
        System.out.println("The Largest Float is ==> "+max);
    }

}
