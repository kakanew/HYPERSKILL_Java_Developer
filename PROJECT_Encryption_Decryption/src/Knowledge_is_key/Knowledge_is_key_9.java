package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] message = scanner.nextLine().toCharArray();
        String cypherText = "";
        int shift = scanner.nextInt() % 26;
        for (char character: message){
            if (character >= 'a' && character <= 'z') {
                if (character + shift > 'z') {
                    cypherText += Character.toString('a' + character + shift - 'z' - 1);
                } else {
                    cypherText += Character.toString(character + shift);
                }
            } else {
                cypherText += Character.toString(character);
            }
        }
        System.out.println(cypherText);
    }
}
