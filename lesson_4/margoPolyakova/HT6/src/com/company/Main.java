package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        int[] array = new int [n];
        array[0] = 55;
        array[1] = 5;
        array[2] = 25;
        array[3] = 55;
        array[4] = 85;
        array[5] = 55;
        array[6] = 8;
        array[7] = 1;
        array[8] = 1;
        array[9] = 27;


        System.out.println("Min = " + minArray(array));
        System.out.println("Max = " + maxArray(array));
    }
    static int maxArray (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }return max;
    }
    static int minArray (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }return min;
    }
}
