package The_while_and_do_while_loops;

//Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.
//        Sample Input 1:
//        50
//        Sample Output 1:
//        1
//        4
//        9
//        16
//        25
//        36
//        49

import java.util.Scanner;

public class Squares_of_natural_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;

        while (Math.pow(number, 2) <= n) {
            System.out.println((int) Math.pow(number, 2));
            number++;
        }
    }
}
