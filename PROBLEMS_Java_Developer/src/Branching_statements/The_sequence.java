package Branching_statements;

//Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
//        (the number is repeated as many times, to what it equals to).
//        The input to the program is a positive integer n:
//        the number of the elements of the sequence the program should print.
//        Output the sequence of numbers, written in a single line, space-separated.
//        For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
//        Sample Input 1:
//        7
//        Sample Output 1:
//        1 2 2 3 3 3 4

import java.util.Scanner;

public class The_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int count = 1;
        int k = 1;
        int gCount = 0;

        while (count <= m) {
            while (k <= count & gCount < m) {
                System.out.print(count + " ");
                k++;
                gCount++;
            }
            k = 1;
            count++;
        }
    }
}
