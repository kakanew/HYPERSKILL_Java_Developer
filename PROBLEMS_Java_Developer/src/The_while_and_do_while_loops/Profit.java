package The_while_and_do_while_loops;

//Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year.
//        Ann wants to know how many years should pass until her deposit in the bank reaches KK money.
//        Can you help her to answer this question?
//        Input contains three integers - M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
//        Output the answer to Ann's question.
//        Sample Input 1:
//        1 100 8
//        Sample Output 1:
//        3
//        Sample Input 2:
//        100 15 120
//        Sample Output 2:
//        2

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialMoney = scanner.nextInt();
        double percent = scanner.nextInt();
        int finalMoney = scanner.nextInt();
        int year = 0;

        while (initialMoney < finalMoney) {
            year++;
            initialMoney = initialMoney + initialMoney * percent / 100;
        }
        System.out.println(year);
    }
}
