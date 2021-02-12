package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String message = scanner.nextLine();
        final int shift = Integer.parseInt(scanner.nextLine()) % 27;

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + ((c + shift) % 'a') % 26);
            }
            System.out.print(c);
        }
    }
}
