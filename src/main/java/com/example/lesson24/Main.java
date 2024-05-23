package com.example.lesson24;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String RESULT_PATTERN = "Equation %sx^2 + %sx + %s %s";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me coefficient x^2");
        int a = scanner.nextInt();

        System.out.println("Give me coefficient x^1");
        int b = scanner.nextInt();

        System.out.println("Give me coefficient x^0");
        int c = scanner.nextInt();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double[] roots = equation.getRoots();
        String resultRoot;
        if (Objects.isNull(roots)) {
            resultRoot = "hasn't roots";
        }
        else if (roots.length == 2) {
            resultRoot = "has two root, x1 = " + roots[0] + " x2 = " + roots[1];
        } else {
            resultRoot = "has one root, x = " + roots[0];
        }

        System.out.printf((RESULT_PATTERN) + "%n", a, b, c, resultRoot);
    }
}
