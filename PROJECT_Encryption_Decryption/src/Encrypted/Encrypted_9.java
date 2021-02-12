package Encrypted;

public class Encrypted_9 {
    public static char encode(char c) {
        char result = c;

        if (result >= 'a' && result <= 'z') {
            result = (char)('a' + 'z' - result);
        }

        return result;
    }

    public static void main(String[] args) {
        final String input = "we found a treasure!";

        for (int i = 0; i < input.length(); i++) {
            System.out.print(encode(input.charAt(i)));
        }

        System.out.println();
    }
}
