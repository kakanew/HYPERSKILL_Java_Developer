package Processing_strings;

//Upon learning that DNA is not a random string,
//        freshmen of the Bioinformatics Institute from the informatics group suggested
//        using a compression algorithm that compresses repeated characters in a string.
//        Encoding is performed as follows:
//        The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.
//        Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding must be case sensitive.
//        Note, string can contain only a single character.
//        Sample Input 1:
//        aaaabbcaa
//        Sample Output 1:
//        a4b2c1a2
//        Sample Input 2:
//        abc
//        Sample Output 2:
//        a1b1c1
//        Sample Input 3:
//        aaaaa
//        Sample Output 3:
//        a5

import java.util.Scanner;

public class Compression_algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char el = line.charAt(0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == el) {
                count++;
            } else {
                System.out.print(el);
                System.out.print(count);
                el = line.charAt(i);
                count = 1;
            }
        }
        System.out.print(el);
        System.out.print(count);
    }
}
