package Relational_operators;

//Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.
//        The program must output true or false.
//        Sample Input 1:
//        1 2 3
//        Sample Output 1:
//        false
//        Sample Input 2:
//        4 16 7
//        Sample Output 2:
//        true

import java.util.Scanner;

public class Check_the_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean test = a + b == 20 || b + c == 20 || a + c == 20;

        System.out.print(test);
    }
}
