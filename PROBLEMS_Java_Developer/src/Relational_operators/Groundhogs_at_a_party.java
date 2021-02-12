package Relational_operators;

//Groundhogs like to throw fun parties, and at their parties,
//        they like to eat Reese's peanut butter cups.
//        But not too many of them, or they feel sick!
//        A successful groundhog party will have between 10 and 20 Reese's peanut butter cups,
//        inclusive unless it is the weekend, in which case they will need 15 to 25 Reese's peanut butter cups, inclusive.
//        Write a Java program that reads two values:
//        the first is the number of Reese's peanut butter cups;
//        the second is a boolean representing whether it is the weekend.
//        The program must print the boolean value - the party is successful or not.
//        Sample Input 1:
//        5 true
//        Sample Output 1:
//        false
//        Sample Input 2:
//        16 false
//        Sample Output 2:
//        true

import java.util.Scanner;

public class Groundhogs_at_a_party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int butter = scanner.nextInt();
        boolean whether = scanner.nextBoolean();

        boolean test1 = butter >= 10 && butter <= 20;
        boolean test2 = butter >= 15 && butter <= 25;

        System.out.println(test1 && !whether || test2 && whether);
    }
}
