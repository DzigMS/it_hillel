package lesson4;

import java.util.Scanner;

public class Main {
    static  final String RESULT_PATTERN = "The number is:\n %s";

    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, please");
        int number = scanner.nextInt();

        //  calculation / business logic
        String evenOrOdd = evenOrOddMethod(number);

        String positiveOrNegative = getPositiveOrNegative(number);

        String primeOrComposite = getPrimeOrComposite(number);

        //  output

//        String result = String.format(RESULT_PATTERN, isEven);
//        result.formatted(isEven);
        System.out.println("The number is:\n" +
                evenOrOdd + "\n" +
                positiveOrNegative + "\n" +
                primeOrComposite);

//        System.out.println(result);
    }

    private static String getPrimeOrComposite(int number) {
        //  prime or composite
        String primeOrComposite = number > 0 ? "prime" : "composite";
//        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number %i == 0) {
                primeOrComposite = "composite";
//                isPrime = false;
                break;
            }
        }
        return primeOrComposite;
    }

    private static String getPositiveOrNegative(int number) {
        //  positive or negative
        String positiveOrNegative = "The number is not positive or negative it's just a 0";
//        if (number == 0) {
//            positiveOrNegative = "The number is not positive or negative it's just a 0";
//        }
        if (number > 0) {
            positiveOrNegative = "positive";
        } else if (number < 0) {
            positiveOrNegative = "negative";
        }
//        boolean isPositive = number > 0;
        return positiveOrNegative;
    }

    private static String evenOrOddMethod(int number) {
        //  even or odd
//        String evenOrOdd = "odd";
//        if (number%2 == 0){
//            evenOrOdd = "even";
//        }
//        else {
//            evenOrOdd = "odd";
//        }
        String evenOrOdd = (number %2 == 0) ? "even" : "odd";
//        boolean isEven = (number%2 == 0);
        return evenOrOdd;
    }
}
