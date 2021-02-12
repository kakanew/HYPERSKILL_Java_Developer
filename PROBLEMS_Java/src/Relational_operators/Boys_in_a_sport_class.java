package Relational_operators;

//Suppose there are three boys in a sports class.
//        You need to write a program that checks the boys are arranged
//        in the ascending or descending order by height.
//        The program must read three integer numbers h1, h2, h3 and outputs true or false.
//        If boys have the same height, they are considered as correctly arranged.
//        Sample Input 1:
//        165 161 158
//        Sample Output 1:
//        true
//        Sample Input 2:
//        155 165 160
//        Sample Output 2:
//        false
//        Sample Input 3:
//        161 161 165
//        Sample Output 3:
//        true

import java.util.Scanner;

public class Boys_in_a_sport_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean test1 = num1 <= num2 && num2 <= num3;
        boolean test2 = num1 >= num2 && num2 >= num3;

        System.out.println(test1 || test2);
    }
}
