package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine().toLowerCase();
        int key = scanner.nextInt();

        for (int i = 0; i < message.length(); i++) {
            char temp = message.charAt(i);

            if (temp == ' ') {
                System.out.print(temp);
            } else if (temp + key > 'z') {
                int tempKey = key - ('z' - temp);
                temp = (char) ('`' + tempKey);
                System.out.print(temp);
            } else {
                temp += key;
                System.out.print(temp);
            }
        }
    }
}
