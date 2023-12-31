package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtract(first, second)
                + div(first, second);
    }

    public static double allOperations(double first, double second) {
        return subtract(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разности и деления равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета всех операций равен: " + allOperations(10, 20));

    }

}
