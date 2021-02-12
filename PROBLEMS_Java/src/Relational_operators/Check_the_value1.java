package Relational_operators;

//Write a program that reads a value and checks if it is less than 10.
//        Sample Input 1:
//        5
//        Sample Output 1:
//        true

import java.util.Scanner;

public class Check_the_value1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean test = num < 10;

        System.out.println(test);
    }
}
