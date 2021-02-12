package Encrypted;

public class Encrypted_4 {
    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String rAlphabets = "zyxwvutsrqponmlkjihgfedcba";
        String text = "we found a treasure!";
        String ctext = "";
        int index;
        for (String s: text.split("")) {
            index = alphabets.indexOf(s);
            if (index != -1) {
                ctext = ctext + rAlphabets.charAt(index);
            } else {
                ctext = ctext + s;
            }
        }
        System.out.println(ctext);
    }
}
