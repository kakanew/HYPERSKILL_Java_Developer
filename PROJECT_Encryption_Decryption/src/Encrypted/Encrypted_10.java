package Encrypted;

public class Encrypted_10 {
    public static void main(String[] args) {
        String plain = "we found a treasure!";
        int a = 'a';
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < plain.length(); i++) {
            char p = plain.charAt(i);
            if (p >= 'a' && p <= 'z') {
                p = (char) (p + 25 - p % a * 2);
            }
            cipher.append(p);
        }

        System.out.println(cipher);
    }
}
