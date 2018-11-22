package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 100000; i < 999999; i++) {
            int n1 = (i / 100000) % 10;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10;
            int n4 = (i / 100) % 10;
            int n5 = (i / 10) % 10;
            int n6 = (i % 10);
            int sum1 = n1 + n2 + n3;
            int sum2 = n4 + n5 + n6;
            if (sum1 == sum2) {
                System.out.println("Happy:" + i + ", ");

            }




    }
    }
}
