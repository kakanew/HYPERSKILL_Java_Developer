package Scanning_the_input;

//Write a program that reads five words from the standard input and outputs each word in a new line. The words should be in the same order.
//        Sample Input 1:
//        This Java platform
//        is adaptive
//        Sample Output 1:
//        This
//        Java
//        platform
//        is
//        adaptive

import java.util.Scanner;

public class Printing_each_word_in_a_new_line {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String wordOne = scanner.next();
            String wordTwo = scanner.next();
            String wordThree = scanner.next();
            String wordFour = scanner.next();
            String wordFive = scanner.next();

            System.out.println(wordOne);
            System.out.println(wordTwo);
            System.out.println(wordThree);
            System.out.println(wordFour);
            System.out.println(wordFive);
        }
}
