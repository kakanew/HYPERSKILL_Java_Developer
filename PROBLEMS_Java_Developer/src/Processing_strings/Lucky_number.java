package Processing_strings;

//Given the number N with an even number of digits.
//        If the sum of the first half of the digits equals the sum of the second half of the digits,
//        then this number is considered lucky. For a given number,
//        output "YES" if this number is lucky, otherwise output "NO".
//        Sample Input 1:
//        12344321
//        Sample Output 1:
//        YES
//        Sample Input 2:
//        125322
//        Sample Output 2:
//        NO

import java.util.Scanner;

public class Lucky_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int middle = num.length() / 2;
        String part1 = num.substring(0, middle);
        String part2 = num.substring(middle);
        int part1sum = 0;
        for (Character part1char : part1.toCharArray()) {
            part1sum += Integer.valueOf(part1char.toString());
        }
        int part2sum = 0;
        for (Character part2char : part2.toCharArray()) {
            part2sum += Integer.valueOf(part2char.toString());
        }
        if (part1sum == part2sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
