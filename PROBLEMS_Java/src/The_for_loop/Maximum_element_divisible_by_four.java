package The_for_loop;

//Given a sequence of natural numbers, not exceeding 30000.
//        Find the maximum element divisible by 4.
//        There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
//        As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines). The program should print a single number: the maximum element of the sequence divisible by 4.
//        Try to solve this problem by using a for-loop.
//        Sample Input 1:
//        12
//        16
//        87
//        58
//        25
//        73
//        86
//        36
//        79
//        40
//        12
//        89
//        32
//        Sample Output 1:
//        40

import java.util.Scanner;

public class Maximum_element_divisible_by_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < number; i++) {
            int nextNumber = scanner.nextInt();
            if (nextNumber > max && nextNumber % 4 == 0) {
                max = nextNumber;
            }
        }
        System.out.println(max);
    }
}
