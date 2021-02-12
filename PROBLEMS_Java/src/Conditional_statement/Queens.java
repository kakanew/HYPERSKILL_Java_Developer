package Conditional_statement;

//You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
//        Input data format
//        Four integer numbers x_1, y_1, x_2, y_2x
//        Output data format
//        Type "YES" (uppercase) if they hit each other or "NO" if they don't.
//        You may need a method that calculates the absolute value of the number, so here it is:
//        Math.abs(n)
//        Queen is the most powerful and valuable attacking piece in the game of chess. It combines the powers of the bishop and the rook. It is able to move any number of unoccupied squares in a straight line: vertically, horizontally or diagonally.
//        Here's all legal moves of the queen.
//        Sample Input 1:
//        1 1 3 3
//        Sample Output 1:
//        YES
//        Sample Input 2:
//        1 1 4 3
//        Sample Output 2:
//        NO
//        Sample Input 3:
//        2 2 5 2
//        Sample Output 3:
//        YES

import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2) { // Queens are on the same rank.
            System.out.println("YES");
        } else if (y1 == y2) { // Queens are on the same file.
            System.out.println("YES");
        } else if (Math.abs((x1 + y1) - (x2 + y2)) % 2 == 0) { // Queens are on the same diagonal.
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
