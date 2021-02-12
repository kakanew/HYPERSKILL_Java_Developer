package Encrypted;

public class Encrypted_14 {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String message = "we found a treasure!";
        char[] code = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (message.charAt(i) == abc.charAt(j)) {
                    code[i] = abc.charAt(abc.length() - 1 -j);
                    break;
                } else {
                    code[i] = message.charAt(i);
                }
            }
        }
        System.out.println(String.valueOf(code));
    }
}
