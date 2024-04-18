package com.example;

import com.example.lesson10.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int loan = 1000;
//        double percent = 0.05;
//        int quan = 5;
//        double base = (loan * percent) / (1 - (1 / (1 + percent))); // Основание
//        double exponent = quan - 1; // Показатель степени
//        double quanMonth = Math.pow(base, exponent);


        String answer = "y";
        boolean isAgain = true;
        Scanner scanner = new Scanner(System.in);

        do {
            Integer[] numbers = new Integer[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            System.out.println(Arrays.toString(numbers));

            Arrays.sort(numbers, Comparator.reverseOrder());

            System.out.println(Arrays.toString(numbers));
            int k = 10;

            Integer[] innerSorted = new Integer[numbers.length];
//            Collection<Integer> integerCollections = List.of(numbers);

            for (int i = 0; i < numbers.length; i++) {
                if (i%2 == 0) {
                    innerSorted[i/2] = numbers[i];
                    continue;
                }
                innerSorted[numbers.length-1 - i/2] = numbers[i];
            }

            System.out.println(Arrays.toString(innerSorted));

            System.out.println("Do you want to try again");
            answer = scanner.next();
//            isAgain = answer.equalsIgnoreCase(scanner.next());
        } while (answer.equalsIgnoreCase("y"));

    }
}
