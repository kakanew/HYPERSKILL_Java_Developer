package Floating_point_types;

//Write a program which reads a double value xx and evaluates the result of x^3 + x^2 + x + 1 x
//        3
//        +x
//        2
//        +x+1
//        Output data format
//        The double result of the expression.
//        Sample Input 1:
//        22.5
//        Sample Output 1:
//        11920.375

import java.util.Scanner;

public class Exponential_expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double xR = x * x * x + x * x + x + 1;

        System.out.println(xR);
    }
}
