package ru.gb.jcore.sample;

/**
 * main
 */


import ru.gb.jcore.regular.Formatter;
import ru.gb.jcore.regular.MathOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter two numbers: ");
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
        double num1 = 4;
        double num2 = 7;


        double sum = MathOperations.add(num1, num2);
        double difference = MathOperations.subtract(num1, num2);
        double product = MathOperations.multiply(num1, num2);
        double quotient = MathOperations.divide(num1, num2);

        System.out.println(Formatter.formatResult("Sum", num1, num2, sum));
        System.out.println(Formatter.formatResult("Difference", num1, num2, difference));
        System.out.println(Formatter.formatResult("Product", num1, num2, product));
        System.out.println(Formatter.formatResult("Quotient", num1, num2, quotient));
    }
}
