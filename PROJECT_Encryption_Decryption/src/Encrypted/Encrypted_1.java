package Encrypted;//Motivation
//        Today, encryption and decryption algorithms are used everywhere on the Internet to protect our data.
//        This is especially important for sites that handle sensitive data,
//        such as e-commerce sites that accept online card payments and login areas
//        that require users to enter their credentials.
//        To ensure data security, there are complex encryption algorithms behind the scenes.
//        In this project, you will learn how to encrypt and decrypt messages and texts using simple algorithms.
//        We should note that such algorithms are not suitable for industrial use because they can easily be cracked,
//        but these algorithms demonstrate some general ideas about encryption.
//Description
//        For the first stage, you need to manually encrypt the message "we found a treasure!"
//        and print only the ciphertext (in lower case).
//        To encrypt the message, replace each letter with the letter that is in the corresponding position
//        from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a).
//        Do not replace spaces or the exclamation mark.
//        Use the given template to your program to print the ciphertext instead of the original message.
//        The output should look like ## ##### # ########! where # is a lower-case English letter.

public class Encrypted_1 {

    public static int lower_case_a = 'a';
    public static int lower_case_z = 'z';

    public static void main(String[] args) {
        String s = "we found a treasure!";

        StringBuffer reverse = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((int)c >= lower_case_a && (int)c <= lower_case_z)
                reverse.append((char)(lower_case_z - c + lower_case_a));
            else
                reverse.append((char) c);
        }
        System.out.println(reverse.toString());
    }
}
