package com.number.test;

public class EvenNumber {

    // TRANSIENT
    public static void main(String[] args) {
        // the number which can be divided by two are called even number number%2 == 0
        int number = 32;
//        while(number > 0) {
//            String type = number % 2 == 0 ? "EVEN" : "ODD";
//            System.out.println("given number : "+number+", type : "+ type);
//            number--;
//        }÷


        for(; number>0; number--){
            String type = number % 2 == 0 ? "EVEN" : "ODD";
            System.out.println("given number : "+number+", type : "+ type);

        }


    }
}
