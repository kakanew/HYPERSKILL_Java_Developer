package Encrypted;

public class Encrypted_11 {
    public static void main(String[] args) {
        for (char ch : "we found a treasure!".toCharArray()) {
            System.out.print(ch < 'a' || ch > 'z' ? ch : (char) (219 - (int) ch));
        }
    }
}
