package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final String HELLO_MESSAGE = "Text...";

    public static void main(String[] args) {
        int workDays = 20;
        int salaryPerMonth;
        double tax;
        Scanner scanner = new Scanner(System.in);

        if (args.length >= 2) {
             salaryPerMonth = Integer.parseInt(args[0]);
             tax = Double.parseDouble(args[1]);
        } else if (args.length == 1) {
            salaryPerMonth = Integer.parseInt(args[0]);
            System.out.println("Give me please tax");
            tax = scanner.nextDouble();
        } else {
            System.out.println("Give me please salary per month");
            salaryPerMonth = scanner.nextInt();

            System.out.println("Give me please tax");
            tax = scanner.nextDouble();
        }

        double salaryPerDayWithoutTax = salaryPerMonth / workDays;

        double salaryPErDayWithTax = salaryPerDayWithoutTax + salaryPerDayWithoutTax * tax / 100;

        System.out.println("Salary without tax: " + salaryPerDayWithoutTax);
        System.out.println("Salary with tax: " + salaryPErDayWithTax);

//        if - else if - else

//        if ((salaryPerMonth > 10) && (salaryPerMonth < 20)) {
//            System.out.println("salary more then ten but less then twenty");
//        } else if (salaryPerMonth > 100) {
//            System.out.println("you are very rich person");
//        } else if (salaryPerMonth > 50) {
//            System.out.println(" you are rich person");
//        } else {
//            System.out.println("salary not in range from 10 to 20");
//        }

//        int[] defaultIntegers = new int[3];
//        int[] integers = {10, 20, 30 , 7, 1, -5 , 10, -3};
//        Integer[] wrapperIntegers = new Integer[4];
//        boolean[] booleans = new boolean[5];
//        String[] strings = new String[7];
//
//        int[][] twoDimensionalArray = new int[3][];
//        twoDimensionalArray[0] = new int[]{0, 1, 2, 3};
//        twoDimensionalArray[1] = new int[]{10, 11, 12, 13};
//        twoDimensionalArray[2] = new int[]{20, 21, 22, 23};
//
//        System.out.println(twoDimensionalArray[2][0]);
//
//
//        int[][][] threeDimensionalArray = new int[3][][];
//        threeDimensionalArray[0] = new int[4][];
//        threeDimensionalArray[1] = new int[2][];
//        threeDimensionalArray[2] = new int[1][];
//
//        threeDimensionalArray[0][0] = new int[]{0, 1, 2, 3};
//        threeDimensionalArray[0][1] = new int[]{10, 11, 21, 31};
//        threeDimensionalArray[0][2] = new int[]{20, 21, 22, 23};
//        threeDimensionalArray[0][3] = new int[]{30, 31, 32, 33};
//
//        threeDimensionalArray[1][0] = new int[]{100, 101, 102, 103};
//        threeDimensionalArray[1][1] = new int[]{110, 111, 112, 113};
//
//        threeDimensionalArray[2][0] = new int[]{200, 201, 202, 203};
//
//        System.out.println(threeDimensionalArray[1][0][0]);
//
//        System.out.println(Arrays.toString(twoDimensionalArray));
//        System.out.println(Arrays.toString(twoDimensionalArray[0]));
//        System.out.println(Arrays.toString(twoDimensionalArray[1]));
//        System.out.println(Arrays.toString(twoDimensionalArray[2]));


//        System.out.println(Arrays.toString(defaultIntegers));
//        System.out.println(Arrays.toString(integers));
//        System.out.println(Arrays.toString(booleans));
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(wrapperIntegers));
    }
}
