package Encrypted;

public class Encrypted_12 {
    public static void main(String[] args) {
        final String message = "we found a treasure!";
        StringBuilder cipherText = new StringBuilder();

        for(int i = 0; i < message.length(); ++i) {
            if((message.charAt(i) != ' ') && (message.charAt(i) != '!')){
                cipherText.append(Character.toString('z' - message.charAt(i) + 'a'));
            }
            else if(message.charAt(i) == ' '){
                cipherText.append(" ");
            }
            else if (message.charAt(i) == '!'){
                cipherText.append("!");
            }
        }

        System.out.println(cipherText);
    }
}
