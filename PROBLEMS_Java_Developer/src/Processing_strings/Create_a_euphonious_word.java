package Processing_strings;

//All the letters of the English alphabet are divided into vowels and consonants.
//        The vowels are: a, e, i, o, u, y.
//        The remaining letters are consonants.
//        A word is considered euphonious if it has not three or more vowels or consonants in a row. Otherwise,
//        it is considered discordant.
//        Your task is to create euphonious words from discordant. You can insert any letters inside word.
//        You should output the minimum number of characters needed to create a euphonious word from a given word.
//        For example, word "schedule" is considered discordant because it has three consonants in a row - "sch".
//        To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
//        Sample Input 1:
//        schedule
//        Sample Output 1:
//        1
//        Sample Input 2:
//        garage
//        Sample Output 2:
//        0
//        Sample Input 3:
//        player
//        Sample Output 3:
//        1
//        Sample Input 4:
//        biiiiig
//        Sample Output 4:
//        2

import java.util.Scanner;

public class Create_a_euphonious_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] input2 = input.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int[] numVowels = new int[input.length()];
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int n = 0; n < 6; n++) {
                if (input2[i] == vowels[n]) {
                    numVowels[i] = 1;
                    break;
                } else {
                    numVowels[i] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (numVowels[i] == numVowels[i + 1]) {
                count++;
                if (count == 2) {
                    result++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}
