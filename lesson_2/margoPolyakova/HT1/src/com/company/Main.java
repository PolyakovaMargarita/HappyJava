package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int first = 299, second = 29, third = 67;
        if (first < second && first < third) {
            System.out.println("Min = " + first);
        } else if (second < first && second < third) {
            System.out.println("Min = " + second);
        } else {
            System.out.println("Min = " + third);
        }

    }
}
