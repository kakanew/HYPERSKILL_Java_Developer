package Conditional_statement;

//Write a program that reads the number and prints YES if it is positive.
//        Otherwise, the program should print NO.
//        Do not forget that zero is not a positive number.
//        Sample Input 1:
//        7
//        Sample Output 1:
//        YES

import java.util.Scanner;

public class Check_a_number_is_positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
