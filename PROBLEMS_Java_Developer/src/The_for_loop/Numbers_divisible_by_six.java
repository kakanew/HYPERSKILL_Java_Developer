package The_for_loop;

//Given the sequence of natural numbers. Find the sum of numbers divisible by 6.
//        The input is the number of elements in the sequence, and then the elements themselves.
//        In this sequence, there is always a number divisible by 6.
//        Sample Input 1:
//        8
//        11
//        12
//        68
//        6
//        98
//        81
//        36
//        86
//        Sample Output 1:
//        54

import java.util.Scanner;

public class Numbers_divisible_by_six {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int next = scanner.nextInt();
            if (next % 6 == 0) {
                sum += next;
            }
        }
        System.out.println(sum);
    }
}
