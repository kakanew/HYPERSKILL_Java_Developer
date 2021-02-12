package String;

//Write a program that checks if a given string starts with the prefix "J" ignoring the case.
//        The program should output true or false.
//        Sample Input 1:
//        Java
//        Sample Output 1:
//        true
//        Sample Input 2:
//        Kotlin
//        Sample Output 2:
//        false

import java.util.Scanner;

public class Check_prefix_ignoring_the_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jChar = "j";
        String s = scanner.nextLine().substring(0, 1);
        System.out.println(s.equalsIgnoreCase(jChar));
    }
}
