package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_12 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var text = scan.nextLine();
        var number = scan.nextInt();
        var alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char s : text.toCharArray()){
            if (!alphabet.contains(String.valueOf(s))){
                System.out.print(s);
                continue;
            }
            int res = s + number;
            if (res > 'z') {
                res = s + number - 26;
            }
            char resultChar = (char) res;
            System.out.print(resultChar);
        }
    }
}
