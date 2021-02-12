package Conditional_statement;

//Given an integer as input. Output True if its value is within the interval
//        (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).
//        Here are two types of brackets in the intervals:
//        parenthesis () exclude the border number;
//        and square brackets [] include the border number.
//        Sample Input 1:
//        20
//        Sample Output 1:
//        True
//        Sample Input 2:
//        -20
//        Sample Output 2:
//        False

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a > -15 & a <= 12 | a > 14 & a < 17 | a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
