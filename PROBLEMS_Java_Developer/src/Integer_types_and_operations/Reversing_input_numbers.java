package Integer_types_and_operations;

//Write a program that reads two integer numbers from the standard input and outputs
//        them in the reverse order separated by one space.
//        Sample Input 1:
//        1 2
//        Sample Output 1:
//        2 1

import java.util.Scanner;

public class Reversing_input_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(b + " " + a);
    }
}
