package String;

//Write a program that reads two lines and compares them without whitespaces.
//        The program should prints true if both lines are equal, otherwise – false.
//        Sample Input 1:
//        string
//        str ing
//        Sample Output 1:
//        true
//        Sample Input 2:
//        string
//        my string
//        Sample Output 2:
//        false

import java.util.Scanner;

public class Comparing_strings_ignoring_whitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String str1NoSpaces = str1.replace(" ", "");
        String str2NoSpaces = str2.replace(" ", "");

        System.out.println(str1NoSpaces.equals(str2NoSpaces));
    }
}
