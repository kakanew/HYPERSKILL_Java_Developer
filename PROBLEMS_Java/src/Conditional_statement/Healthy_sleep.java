package Conditional_statement;

//Ann watched a TV program about health and learned that it is recommended to sleep at least A hours per day,
//        but oversleeping is also not healthy, and you should not sleep more than B hours. Now Ann sleeps H hours per day.
//        If Ann's sleep schedule complies with the requirements of that TV program – print "Normal".
//        If Ann sleeps less than A hours, output “Deficiency”, and if she sleeps more than B hours, output “Excess”.
//        Input to this program are the three strings with variables in the following order: AA, BB, HH. AA is always less than or equal to BB.
//        Please note the letters' cases: the output should exactly correspond to what required in the problem, i.e. if the program must output "Excess", output such as "excess", "EXCESS", or "ExCeSs" will not be graded as correct.
//        You should carefully think about all the conditions, which you need to use. Special attention should be paid to the strictness of the used conditional operators: distinguish between \lt< and \le≤; \gt> and \ge≥. In order to understand which ones to use, please carefully read the problem statement.
//        Sample Input 1:
//        6
//        10
//        8
//        Sample Output 1:
//        Normal
//        Sample Input 2:
//        7
//        9
//        10
//        Sample Output 2:
//        Excess
//        Sample Input 3:
//        7
//        9
//        2
//        Sample Output 3:
//        Deficiency

import java.util.Scanner;

public class Healthy_sleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b && b >= a) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
