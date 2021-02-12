package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int num = scanner.nextInt();

        for (int i = 0; i < message.length(); i++) {
            char[] newMsn = message.toCharArray();
            newMsn[i] += num;
            if (newMsn[i] - num == ' ') {
                System.out.print(' ');
            } else if (newMsn[i] > 'z') {
                int msn = 'a' + ((newMsn[i] - 'a') % 26);
                newMsn[i] = (char) msn;
                System.out.print(newMsn[i]);
            } else {
                System.out.print(newMsn[i]);
            }
        }
        scanner.close();
    }
}
