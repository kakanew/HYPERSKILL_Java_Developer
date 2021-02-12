package The_while_and_do_while_loops;

//Given a sequence of natural numbers, not exceeding 30000.
//        Find the maximum element divisible by 4. As input,
//        the program gets the number of elements in the sequence, and then the elements themselves.
//        In the sequence, there is always an element divisible by 4.
//        The number of elements does not exceed 1000.
//        The program should print a single number: the maximum element of the sequence divisible by 4.
//        Try to solve this problem by using a while-loop.
//        Sample Input 1:
//        10
//        76
//        18
//        69
//        63
//        36
//        18
//        49
//        16
//        12
//        50
//        Sample Output 1:
//        76

import java.util.Scanner;

public class The_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = 0; // "a sequence of natural numbers"

        do {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            count--;
        } while (count != 0);

        System.out.print(max);
    }
}
