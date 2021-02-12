package Encrypted;

public class Encrypted_8 {
    public static void main(String[] args) {
        char[] str = "we found a treasure!".toLowerCase().toCharArray();
        StringBuilder string = new StringBuilder();

        for (char c : str) {
            if (c < 97) {
                string.append(c);
            } else {
                string.append((char) ('z' - c + 97));
            }
        }

        System.out.println(string);
    }
}
