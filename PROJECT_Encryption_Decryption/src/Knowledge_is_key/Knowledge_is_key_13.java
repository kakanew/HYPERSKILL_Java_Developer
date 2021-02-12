package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] plain = scanner.nextLine().toLowerCase().toCharArray();
        int key = scanner.nextInt();
        StringBuilder encrypted = new StringBuilder();
        for (char ch : plain) {
            if (ch >= 97 && ch <= 122) {
                encrypted.append((char) (((ch - 97 + key) % 26) + 97));
            } else {
                encrypted.append(ch);
            }
        }
        System.out.println(encrypted.toString());
    }
}
