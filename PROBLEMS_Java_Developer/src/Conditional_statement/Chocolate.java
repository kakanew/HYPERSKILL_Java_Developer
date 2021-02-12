package Conditional_statement;

//Wow! This problem is kind of tricky.
//        If you're ready to put your thinking cap on, brace yourself and good luck!
//        Otherwise, you can skip it by now and return any time later
//        Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
//        Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width. Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal.
//        Each segment is 1x1.
//        Input data format
//        The program gets an input of three integers: N, M, K.
//        Output data format
//        The program must output one of the two words: YES or NO.
//        Sample Input 1:
//        4
//        2
//        6
//        Sample Output 1:
//        YES
//        Sample Input 2:
//        2
//        10
//        7
//        Sample Output 2:
//        NO
//        Sample Input 3:
//        7
//        4
//        21
//        Sample Output 3:
//        YES

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((k % n == 0 || k % m == 0) && m * n > k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
