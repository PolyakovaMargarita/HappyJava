package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 20;
        int[] array = new int[n];
        array [0] = 55;
        array [5] = -60;
        array [2] = 100;

        System.out.print(sumOfArray(array) + ", ");


    }
    static int sumOfArray (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } return sum;
    }
}
