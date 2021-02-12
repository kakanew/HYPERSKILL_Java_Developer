package Encrypted;

import java.util.Scanner;

public class Encrypted_6 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        //var text = scan.nextLine();
        var text = "we found a treasure!";
        for (char s : text.toCharArray()){
            if (s == ' ' || s == '!'){
                System.out.print(s);
                continue;
            }
            int res = ('z' - s) + 'a';
            char resultChar = (char) res;
            System.out.print(resultChar);
        }
    }
}
