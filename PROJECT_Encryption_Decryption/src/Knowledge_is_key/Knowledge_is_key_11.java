package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int key = s.nextInt();
        String output = "";
        for (char ch : str.toCharArray()) {
            output += Character.toString((char) (((ch - 'a' + key) % 26) + 'a'));
        }
        String outputFinal = output.replace('Y', ' ');
        System.out.println(outputFinal);
    }
}
