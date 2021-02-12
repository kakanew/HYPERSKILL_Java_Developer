package Encrypted;

public class Encrypted_5 {
    public static void main(String[] args) {
        String message = "we found a treasure!";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('z' - (c % 'a'));
            }
            System.out.print(c);
        }
    }
}
