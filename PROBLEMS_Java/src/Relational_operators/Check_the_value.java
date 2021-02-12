package Relational_operators;

//Write a program that reads an integer value and checks if it is less than 10 and greater than 0.
//        The result is a boolean value (true or false).
//        Sample Input 1:
//        0
//        Sample Output 1:
//        false

import java.util.Scanner;

public class Check_the_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean test = num > 0 && num < 10;

        System.out.println(test);
    }
}
