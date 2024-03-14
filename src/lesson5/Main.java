package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
//        int firstNumber = getNumberFromUserInput();
//        int secondNumber = getNumberFromUserInput();
//        System.out.println(sum(firstNumber, secondNumber));

        int k;
        do {
            k = 0;
        } while (k > 0);

        System.out.println(sum(1, 2, 5, 7, 5, 7));
    }

/*    returnType nameMethod(typeArg1 nameArg1, typeArg2 nameArg2...) {
          local variables;
          business logic;
          return;
      }
 */
    void nameMethod(int arg) {
        if (arg < 0) {
            return;
        }
        System.out.println(arg);
    }


    static int sum(int firstNumber, int secondNumber) {
//        return firstNumber + secondNumber;
//        local variables
        int result = 0;

//        logic
        result = firstNumber + secondNumber;

//        return
        return result;
    }

    static int sum(int firstNumber, int secondNumber, int thirdNumber) {
        return sum(firstNumber, sum(secondNumber, thirdNumber));
    }
    static int sum(int firstNumber, int... otherNumbers) {
        int result = firstNumber;
        for (int n : otherNumbers) {
            result = sum(result, n);
        }
        return result;
    }
    static int sum(String firstNumber, int secondNumber) {
        return sum(Integer.parseInt(firstNumber), secondNumber);
    }
    static int sum(int firstNumber, String secondNumber) {
        return sum(Integer.parseInt(secondNumber), firstNumber);
    }

    static int getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int s = scanner.nextInt();
        return s;
    }

//    int sum(String firstNumber, int secondNumber) {
//
//    }
//    int sum(int firstNumber, String secondNumber) {
//
//    }
}
