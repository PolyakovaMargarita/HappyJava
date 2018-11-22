package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            int number = 555555;
            int sum = sum(number);
        System.out.println(sum);

    }
    static int sum (int number) {
        int sum;
        sum = 1 + (number - 1)%9;
        return sum;
    }
}
