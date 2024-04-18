package com.example.lesson13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        Exception
//        Error
//        System.out.println(5/0);
//        try - catch - finally     // try-catch-catch-...    //try-finally   //try-catch-finally
        String result = null;

        try {
            System.out.println("start program");
            result = method1();
            System.out.println("end program");

        } catch (IllegalArgumentException e) {
            System.out.println("catch IllegalArgumentException " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("catch RuntimeException " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unhandled exception " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

//        InputStream inputStream = null;
//        try (InputStream inputStream = new FileInputStream("path")) {
//        try {
//            inputStream = new FileInputStream("path");
//            inputStream.read();
//        } catch (IOException e) {
//
//        }
//        finally {
//            try {
//                inputStream.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        System.out.println(result);
    }

    public static String method1() throws Exception {
        System.out.println("start first method");
        String s = "";

//        s = method2();
//        if (s == null) {
//            return "m1";
//        }
        try {
            s = method2();
        } catch (IllegalArgumentException e) {
            System.out.println("catch in method1 IllegalArgumentException " + e.getMessage());
        } finally {
            System.out.println("Finally in method1");
        }

        System.out.println("end first method");

        return "m1" + s;
    }

    public static String method2() throws Exception {
        System.out.println("start second method");
        String s = method3();
        System.out.println("end second method");

        return "m2" + s;
    }

    public static String method3() throws Exception {
        System.out.println("start third method");

        if (true) {
            Exception exception = new IllegalArgumentException("Thrown in method3");
            throw exception;
//            throw new RuntimeException();
//            return null;
        }
        System.out.println("end third method");
        return "m3";
    }
}
