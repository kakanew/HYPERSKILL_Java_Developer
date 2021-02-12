package The_for_loop;

//Write a program that prints the product of all integer numbers from a to b (a < b).
//        Include a and exclude b from the product.
//        Sample Input 1:
//        1 2
//        Sample Output 1:
//        1
//        Sample Input 2:
//        100 105
//        Sample Output 2:
//        11035502400

import java.util.Scanner;

public class The_product_of_numbers_from_a_to_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        long prod = 1;
        for (int i = num1; i < num2; i++) {
            prod *= i;
        }

        System.out.println(prod);
    }
}
