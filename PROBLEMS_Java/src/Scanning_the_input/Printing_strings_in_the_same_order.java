package Scanning_the_input;

//Write a program that reads four words and outputs them in the same order, each in a new line.
//        Sample Input 1:
//        Hello
//        Java
//        Future programmer
//        Sample Output 1:
//        Hello
//        Java
//        Future
//        programmer

import java.util.Scanner;

public class Printing_strings_in_the_same_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine(); // Hello
        String word2 = scanner.nextLine(); // Java
        String word3 = scanner.next(); // Future
        String word4 = scanner.next(); // programmer

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
    }
}
