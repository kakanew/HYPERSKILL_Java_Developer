package Integer_types_and_operations;

//Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
//        Sample Input 1:
//        476
//        Sample Output 1:
//        17

import java.util.Scanner;

public class The_sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dig1 = num / 100; // 4
        int dig2 = (num / 10) % 10; // 7
        int dig3 = num % 10;  // 6

        System.out.println(dig1 + dig2 + dig3);

    }
}
