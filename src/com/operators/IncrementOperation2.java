package com.operators;

public class IncrementOperation2 {
    static int k = 7;

    public static void main(String[] args) {
        int i = 5;
        int j = ++i; // 6

        i = k++; // 7
        System.out.println(k);
        k = j; // 6
        k++;         // return k =6
        //  k=k+1;

        System.out.println(i); //7
        System.out.println(j); //6
        System.out.println(k);
    }



}
