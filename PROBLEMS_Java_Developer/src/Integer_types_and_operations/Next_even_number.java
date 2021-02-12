package Integer_types_and_operations;

//Given a natural number, not greater than 10000.
//        Output the even number following this number.
//        Sample Input 1:
//        7
//        Sample Output 1:
//        8
//        Sample Input 2:
//        8
//        Sample Output 2:
//        10

import java.util.Scanner;

public class Next_even_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + 2);
        } else {
            System.out.println(num + 1);
        }
    }
}
