package ru.gb.jcore.regular;

/**
 * formatter
 */

public class Formatter {
    public static String formatResult(String operation, double a, double b, double result) {
        return String.format("%s of %.2f and %.2f is %.2f", operation, a, b, result);
    }
}

