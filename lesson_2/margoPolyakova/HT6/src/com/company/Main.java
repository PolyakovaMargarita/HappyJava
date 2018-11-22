package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 5, b = 0, c = 10;
        int ca = c - a;
        int cb = c - b;
        if (ca < cb) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
