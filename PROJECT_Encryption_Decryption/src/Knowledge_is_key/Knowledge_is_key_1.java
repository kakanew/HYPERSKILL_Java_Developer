package Knowledge_is_key;//Description
//        Write a program that reads an English message and an integer number (key)
//        from the standard input and shifts each letter by
//        the specified number according to its order in the alphabet.
//        If you reach the end of the alphabet, start back at the beginning (a follows z).
//        The English alphabet is below:
//        abcdefghijklmnopqrstuvwxyz
//        The program should not modify non-letter characters.
//        The key is assumed to mean that if a person knows the value of the key,
//        he or she will be able to decrypt the text, and if he or she does not know,
//        he or she will not be able to decrypt the text.
//        It's like a real key that can open up access to the message text.
//        Note, key is just a special parameter that controls the behavior of our encryption algorithm.
//        See the picture below for more information.
//Input example
//        welcome to hyperskill
//        5
//Output example
//        bjqhtrj yt mdujwxpnqq

import java.util.Scanner;

public class Knowledge_is_key_1 {
    public static void main(String args[]) {
        //Input the plaintext message
        Scanner sc = new Scanner(System.in);
        //Enter the value by which each character in the plaintext message gets shifted
        String plaintext = sc.nextLine();
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++)
        {
            // Shift one character at a time
            alphabet = plaintext.charAt(i);

            // if alphabet lies between a and z
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                // if shift alphabet greater than 'z'
                if(alphabet > 'z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }

            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);

                // if shift alphabet greater than 'Z'
                if(alphabet > 'Z') {
                    //reshift to starting position
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(ciphertext); //ciphertext
    }
}
