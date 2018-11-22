package com.company;

public class Main {

    public static void main(String[] args) {

        int rentDay = 5, oneDayRent = 50;
        int rent = oneDayRent * rentDay;

        if (rentDay >= 7) {
             rent = rent - 50;
         } else if (rentDay >= 5) {
             rent = rent - 20;
         } else {
            rent = rent;
        }


        System.out.println(rent);
    }
}
