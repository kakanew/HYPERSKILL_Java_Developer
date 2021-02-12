package Encrypted;

public class Encrypted_3 {
    public static void main(String[] args) {

        String input = "we found a treasure!";

        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                System.out.print((char) ('z' - (input.charAt(i) - 'a')));
            } else {
                System.out.print(input.charAt(i));
            }

        }
    }
}
