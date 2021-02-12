package Floating_point_types;

//Write a program that reads three double values a, b, c,
//        and then solving the simplest equation:
//        a * x + b = c
//        The program should output the value of x.
//        It's guaranteed, a is not 0.
//        Sample Input 1:
//        2 -1 2
//        Sample Output 1:
//        1.5

import java.util.Scanner;

public class Find_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x = (c - b) / a;

        System.out.println(x);
    }
}
