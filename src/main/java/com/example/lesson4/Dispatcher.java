package com.example.lesson4;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me a number, please");
//        int number = scanner.nextInt();

//        switch - case
/*
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 10:
                System.out.println("Number less then 10");
                break;
            case 20:
                System.out.println("Number less then 20");
//                break;
            case 30:
                System.out.println("Number less then 30");
//                break;
            default:
                System.out.println("Something else");
        }
*/

//        int i = 0;
//        for
//        for (; ; ) {
//            System.out.println("i = " + i);
////            System.out.println("i = ");
//            i += 777;
//            if (i > 100000) {
//                break;
//            }
//        }

//        System.out.println("i : " + i);

        int sum = 0;
        int sumOfPositiveNumbers = 0;

//        for (int i = 0; i < args.length; i++) {
//            System.out.println("i = " + i);
//            System.out.println("value = " + args[i]);
//            int number = Integer.parseInt(args[i]);
//            sum += number;
//            if (number > 0) {
//                sumOfPositiveNumbers += number;
//            }
//            System.out.println("sum = " + sum);
//        }
//        System.out.println(sum);
//        System.out.println("sumOfPositiveNumbers = " + sumOfPositiveNumbers);

//        foreach
//        int multiple = 1;
//        for (String number : args) {
//            int num = Integer.parseInt(number);
//            System.out.println("num = " + num);
//            multiple *= num;
//        }

/*        for (Product product : productBag) {
            if (isNeedFridgeForProduct) {
                moveToFridge();
            } else {
                moveTo();
            }
        }*/

//        System.out.println("multiple = " + multiple);

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i != j) {
//                    System.out.print(" ");
//                    continue;
//                }
//                System.out.print(String.valueOf(i) + j + " ");
//                if (i == j) {
//                    break;
//                }

//            }
//            if (i%2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }


//        while (condition) - > for (; condition;)
        int k = 0;
        while (true) {
            System.out.println("k = " + k);
            k++;
            if (k == 7) {
                break;
            }
        }
//        System.out.println(k);

        do {
            System.out.println("One time");
        } while (k < 7);
    }
}
