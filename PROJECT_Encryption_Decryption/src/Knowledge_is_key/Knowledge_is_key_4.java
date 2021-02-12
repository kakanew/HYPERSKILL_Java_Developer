package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int key = sc.nextInt();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int ch1 = ch - 'a' + key;
                ch1 = ch1 % 26;
                System.out.print((char) (ch1 + 'a'));
            } else {
                System.out.print(ch);
            }
        }
    }
}
