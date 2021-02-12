package The_for_loop;

//Print the sum of all integers from a to b including both.
//        It is guaranteed that a < b in all test cases.
//        Sample Input 1:
//        3
//        22
//        Sample Output 1:
//        250

import java.util.Scanner;

public class The_sum_of_integers_from_a_to_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (; a <= b; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
