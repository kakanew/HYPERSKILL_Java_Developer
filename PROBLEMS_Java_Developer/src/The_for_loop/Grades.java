package The_for_loop;

//Find the number of D, C, B and A grades for the last test on informatics,
//        where n students from a class have successfully passed the test.
//        In this task, we use a 5-point grading system and are interested only in passing grades:
//        from 2 to 5. They correspond to the letter grades in the following way:
//        5 is for A, 4 is for B, 3 is for C and 2 is for D.
//        The program gets number n as input and then gets the grades themselves: one by one.
//        The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.
//        Sample Input 1:
//        13
//        2
//        5
//        5
//        5
//        5
//        3
//        2
//        4
//        3
//        3
//        3
//        2
//        3
//        Sample Output 1:
//        3 5 1 4

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < num; i++) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 2:
                    a++;
                    break;
                case 3:
                    b++;
                    break;
                case 4:
                    c++;
                    break;
                case 5:
                    d++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + grade);
            }
        }
        System.out.print(a + " " + b + " " + c + " " + d);
    }
}
