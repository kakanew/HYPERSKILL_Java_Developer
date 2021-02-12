package Knowledge_is_key;

import java.util.Scanner;

public class Knowledge_is_key_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hh = sc.nextLine();
        int n = sc.nextInt();
        for (char i: hh.toCharArray()){

            if(!Character.isLetter(i)){
                System.out.print(i);

            }else {
                int p =alphabet.indexOf(i)+n;
                if(p>26){
                    p = p-26;
                }

                System.out.print(alphabetarrya[p]);
            }
        }
    }
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static char[]alphabetarrya = alphabet.toCharArray();
}
