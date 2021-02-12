package The_while_and_do_while_loops;

//A user inputs a long positive number M.
//        You need to find out what is the smallest int number n such that n! > M.
//        Just in case: wiki on factorials.
//        Sample Input 1:
//        6188989133
//        Sample Output 1:
//        13
//        Sample Input 2:
//        6
//        Sample Output 2:
//        4

import java.util.Scanner;

public class The_smallest_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long fac = 1;
        int i = 1;
        do {
            fac = fac * i;
            i++;
        } while (fac <= num);
        System.out.println(i - 1);
    }
}
