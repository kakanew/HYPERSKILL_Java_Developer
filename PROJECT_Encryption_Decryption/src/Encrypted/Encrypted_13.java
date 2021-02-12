package Encrypted;

public class Encrypted_13 {
    public static void main(String[] args) {
        String s = "we found a treasure!";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                char t = (char)(-1 * (c - 'a') + (int)'z');
                System.out.print(t);
            }
            else
                System.out.print(c);
        }
    }
}
