package com.bridgelabz;

public class Comparison {
    public Comparison() {

    }
    //To find largest number among three Integer
    public static  Integer largest(Integer x, Integer y, Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome To The Genirics Program");
        Integer xInt = 20;
        Integer yInt = 451;
        Integer zInt = 68;

        //compaaring maximum value
        Integer max = new Comparison().largest(xInt,yInt,zInt);
        System.out.println("The Largest Interger is ==> "+max);
    }
}
