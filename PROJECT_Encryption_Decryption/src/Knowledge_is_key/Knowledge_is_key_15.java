package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine().toLowerCase();
        int key = scanner.nextInt();
        for (int i = 0; i < message.length(); i++) {
            System.out.print(encrypt(message.charAt(i), key));
        }
    }
    static char encrypt(char ch, int key) {
        if (Character.isLetter(ch)) {
            if (ch + (char) key <= 'z') {
                return (char) (ch + (char) key);
            } else {
                return (char) (ch + (char) key - 'z' + 'a' - 1);
            }
        } else {
            return ch;
        }
    }
}
