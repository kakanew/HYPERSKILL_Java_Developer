package Relational_operators;

//Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
//        Otherwise, it should print false.
//        Sample Input 1:
//        1 1 1
//        Sample Output 1:
//        false
//        Sample Input 2:
//        1 0 -1
//        Sample Output 2:
//        true

import java.util.Scanner;

public class Exactly_one_parameter_is_positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean test1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean test2 = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean test3 = num1 <= num2 && num2 <= 0 && num3 > 0;

        System.out.println(test1 || test2 || test3);
    }
}
