package Floating_point_types;

//Write a program that reads four double values a, b, c, d
//        and then evaluates the following expression
//        a * 10.5 + b * 4.4 + (c + d) / 2.2
//        The program should output the result.
//        Sample Input 1:
//        1
//        2.5
//        0
//        4.4
//        Sample Output 1:
//        23.5

import java.util.Scanner;

public class Evaluate_an_expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;

        System.out.println(result);
    }
}
