package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = number();
        int num2 = number();
        char operand = adition();
        int result = calc(num1, num2, operand);
        System.out.println(result);
    }
    public static int number() {
        System.out.println("Введити число");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Попробуйте еще раз");
            scanner.next();
            num = number();
        }
        return num;
    }
    public static char adition() {
        System.out.println("Введите операцию");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Попробуйте еще раз");
            scanner.next();//рекурсия
            operation = adition();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operand){
        int result;
        switch (operand){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, operand
        }
        return result;
    }

}
