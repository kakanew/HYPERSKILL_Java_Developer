package Scanning_the_input;

//Write a program that reads three strings and outputs them in the reverse order, each in a new line.
//        Sample Input 1:
//        Java
//        Programming
//        Language
//        Sample Output 1:
//        Language
//        Programming
//        Java

import java.util.Scanner;

public class Print_strings_in_the_reverse_order {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine(); // Java
        String line2 = scanner.nextLine(); // Programing
        String line3 = scanner.nextLine(); // Language

        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);
    }
}
