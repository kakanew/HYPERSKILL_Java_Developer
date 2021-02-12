package Encrypted;

public class Encrypted_2 {
    public static void main(String[] args) {

        String openText = ("we found a treasure!");
        char[] charArray = openText.toCharArray();

        for (char letter : charArray) {
            if ((int) letter >= 97 && (int) letter <= 122) {

                System.out.print((char) (122 - (int) letter + 97));
            } else {
                System.out.print(letter);
            }

        }

    }
}
