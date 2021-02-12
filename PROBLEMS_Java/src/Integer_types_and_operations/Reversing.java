package Integer_types_and_operations;

//Write a program that reads a three-digit number,
//        calculates the new number by reversing its digits,
//        and outputs a new number.
//        Sample Input 1:
//        320
//        Sample Output 1:
//        23
//        Sample Input 2:
//        976
//        Sample Output 2:
//        679

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int firstDigit = n / 100;
        final int thirdDigit = n % 10;
        final int secondDigit = (n - firstDigit * 100 - thirdDigit) / 10;
        final int reverseN = thirdDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(reverseN);
    }
}
