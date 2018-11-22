package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 20;
        int[] array = new int[n];

        randomArray(array, 1, 10);

        System.out.println("Summa evenArray = " + evenArray(array));
        System.out.println("Summa unevenArray = " + unEvenArray(array));


    }

    static void randomArray (int[] array, int left, int right) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random() * (right - left) * left);

        }
    }
    static int evenArray (int[] array) {
        int sumEven = 0;
        for (int i = 0; i < array.length; i += 2) {
            sumEven += array[i];
        }return sumEven;
    }
    static int unEvenArray (int[] array) {
        int sumUnEven = 0;
        for (int i = 1; i < array.length; i += 2) {
            sumUnEven += array[i];
        }return sumUnEven;
    }
}
