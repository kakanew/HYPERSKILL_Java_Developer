package The_for_loop;

//Write a program that reads a, b, n and outputs the count of numbers divisible
//        by n in the range from a to b (a < b) inclusively.
//        Note:  it is possible to write this program more efficiently without any loops.
//        Sample Input 1:
//        10 20 10
//        Sample Output 1:
//        2
//        Sample Input 2:
//        15 25 5
//        Sample Output 2:
//        3

import java.util.Scanner;

public class The_count_of_numbers_divisible_by_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int div = scanner.nextInt();

        int counter = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % div == 0) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}
