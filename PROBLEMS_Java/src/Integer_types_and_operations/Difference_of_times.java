package Integer_types_and_operations;

//Find how many seconds passed between the two moments of time on the same day.
//        You are given the integer values representing these moments:
//        hours, minutes and seconds for each of them.
//        It is guaranteed that the earlier moment goes first in the input.
//        Input data format
//        The program gets the input of six integers:
//        three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.
//        For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).
//        Output data format
//        Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
//        Sample Input 1:
//        1
//        1
//        1
//        2
//        2
//        2
//        Sample Output 1:
//        3661
//        Sample Input 2:
//        1
//        2
//        30
//        1
//        3
//        20
//        Sample Output 2:
//        50

import java.util.Scanner;

public class Difference_of_times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //                           Input 1 / Input 2
        int hor1 = scanner.nextInt(); // 1   / 1
        int min1 = scanner.nextInt(); // 1   / 2
        int sec1 = scanner.nextInt(); // 1   / 30
        int sum1 = (hor1 *= 3600) + (min1 *= 60) + (sec1 *= 1);

        //                           Input 1 / Input 2
        int hor2 = scanner.nextInt(); // 2   / 1
        int min2 = scanner.nextInt(); // 2   / 3
        int sec2 = scanner.nextInt(); // 2   / 20
        int sum2 = (hor2 *= 3600) + (min2 *= 60) + (sec2 *= 1);

        System.out.println(sum2 - sum1);
    }
}
