package Floating_point_types;

//Write a program that read two double values and prints the difference between the second and the first one.
//        Sample Input 1:
//        18.4
//        -5.0
//        Sample Output 1:
//        -23.4

import java.util.Scanner;

public class Difference_between_two_doubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double diff = num2 - num1;

        System.out.println(diff);
    }
}
