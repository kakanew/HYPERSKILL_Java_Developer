package Branching_statements;

//Given a sequence of natural numbers.
//        For each number of the sequence output "even" if the number is even, otherwise, "odd".
//        If the number is equal to 0, the program must stop reading and processing numbers.
//        Input data
//        A sequence of natural numbers, each number in a new line.
//        Output data
//        The sequence of words "even" and "odd". Each word in a new line.
//        Output the result right after the number is entered. Then input the next one.
//        There's no need to store the sequence.
//        Sample Input 1:
//        1
//        2
//        3
//        4
//        0
//        Sample Output 1:
//        odd
//        even
//        odd
//        even

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
