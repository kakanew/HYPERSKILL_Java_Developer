package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_6 {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            String text = sc.nextLine();
            int shift = sc.nextInt();
            String ctext = "";
            int index;
            for (String s: text.split("")) {
                index = alphabets.indexOf(s);
                if (index != -1) {
                    index = index + shift < 26 ? index + shift : index + shift - 26;
                    ctext = ctext + alphabets.charAt(index);
                } else {
                    ctext = ctext + s;
                }
            }
            System.out.println(ctext);
        }
}
