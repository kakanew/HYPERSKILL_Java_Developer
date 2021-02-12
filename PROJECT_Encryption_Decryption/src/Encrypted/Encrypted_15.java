package Encrypted;

public class Encrypted_15 {
    private static final String ascChars = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        char ss[] = "we found a treasure!".toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (ascChars.contains(String.valueOf(ss[i]))) {
                ss[i] = ascChars.charAt(ascChars.length() - 1 - ascChars.indexOf(ss[i]));
            }
        }
        System.out.println(String.valueOf(ss));
    }
}
