package com.company;

import java.util.*;

/*
Write a Java program to divide a string in n equal parts.
The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:

abcde
fghij
klmno
pqrst
uvwxy
*/

public class Main {
    static void splitString(String str1, int n) {
        if(str1.length() % n != 0){
            System.out.println("It can`t be divided into equal parts.");
            return;
        }

        int begin = 0;
        int end = str1.length() / n;

        for (int i = 0; i < n; i++) {
            System.out.println(str1.substring(begin, end ));
            begin = begin + n;
            end = end + n;
        }
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy"; //length 25
        int split_number = 5;
        splitString(str, split_number);

        str = "abcfdefghijkl"; //length 13
        split_number = 3;
        splitString(str, split_number);

        str = "abcfdefghi"; //length 10
        split_number = 2;
        splitString(str, split_number);

    }
}