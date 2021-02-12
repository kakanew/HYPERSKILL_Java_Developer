package The_while_and_do_while_loops;

//Find the sum of all elements of a sequence, ending with the number 0.
//        The number 0 itself is not included into the sequence and serves as a sign of cessation.
//        Sample Input 1:
//        3
//        6
//        8
//        0
//        Sample Output 1:
//        17

import java.util.Scanner;

public class The_sum_of_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        while ((temp = scanner.nextInt()) != 0) {
            sum += temp;
        }
        System.out.println(sum);
    }
}
