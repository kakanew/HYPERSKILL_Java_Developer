package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int key = sc.nextInt();
        char[] mars = message.toCharArray();
        for (char c : mars) {
            int i = (int)c;
            if (i < 97) {
                i = i;
            } else {
                i = i + key;
            }
            if (i > 122) {
                i = i - 26;
            }
            c = (char)i;
            System.out.print(c);
        }
    }
}
