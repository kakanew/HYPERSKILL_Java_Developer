package Conditional_statement;

//Given a four-digit number.
//        Determine whether its decimal notation is symmetric.
//        If the number is symmetric, output 1; otherwise output any other integer.
//        The number may have less than four digits;
//        in this case you should assume that its decimal notation is complemented by insignificant zeros on the left.
//        Sample Input 1:
//        2002
//        Sample Output 1:
//        1
//        Sample Input 2:
//        2008
//        Sample Output 2:
//        37

import java.util.Scanner;

public class Symmetrical_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        if (a == d && b == c) {
            System.out.print("1");
        } else {
            System.out.print("37");
        }
    }
}
