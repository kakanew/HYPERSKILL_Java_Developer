package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        int shift = scanner.nextInt();

        char a = 'a';
        char z = 'z';
        int size = 26;

        for (char item : chars) {
            if (item >= a && item <= z) {
                char shiftItem = (char) (((item - a + shift) % size) + a);
                System.out.print(shiftItem);
            } else {
                System.out.print(item);
            }
        }
    }
}
