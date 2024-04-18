package com.example.lesson1;

/**
 *
 */
public class Main {
    /*
    More than one line comment
    Second line comment
    ...
     */
    public static void main(String[] args) {
//        args = new String[10];
        byte b;
        b = 127;

        int k = (int) b;
        k*=10;
        b = (byte) k;

        Byte b2;
//        b2 = new Byte(127);
        b2 = 127;
        Byte b3 = 127;
        String s = "s";

        System.out.println(b);
        System.out.println(k);
//        System.out.println(args);
    }
}