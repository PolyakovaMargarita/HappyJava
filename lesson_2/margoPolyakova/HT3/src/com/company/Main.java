package com.company;

public class Main {

    public static void main(String[] args) {

        int first = 2, second = 29, third = 67;
        int more = min(first, second, third);

        System.out.println("Min = " + min(first, second, third));

        if (more == first) {
            System.out.print(", " + more);
        } else if (more == second) {
            System.out.print(", " + more);
        } else if (more == third) {
            System.out.print(", " + more);
        }

    }
    static int min (int first, int second, int third) {
        int min;
        if (first < second && first < third) {
            min = first;
        } else if (second < first && second < third) {
            min = second;
        } else {
            min = third;
        } return min;
    }
}
