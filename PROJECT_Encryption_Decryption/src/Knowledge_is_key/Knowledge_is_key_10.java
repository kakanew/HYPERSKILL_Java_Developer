package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalText = scanner.nextLine();
        int key = scanner.nextInt();

        String cypherText = encrypt(key, originalText);

        System.out.println(cypherText);
    }

    public static String encrypt(int key, String originalText) {
        StringBuilder cypherText = new StringBuilder();
        for (char ch: originalText.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + key) % ('z' - 'a' + 1));
            }
            cypherText.append(ch);
        }

        return cypherText.toString();
    }
}
