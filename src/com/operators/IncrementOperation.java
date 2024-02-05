package com.operators;

public class IncrementOperation {
    public static void main(String[] args) {

        // ++x increment the value and return in the same line
        // x++ return the same value and then increment the given value by 1 in next line
        int i = 2;
        int j = 3;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++j); // 4
        System.out.println(j++); // 4
        System.out.println(j);     //5
    }
}
