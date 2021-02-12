package Encrypted;

public class Encrypted_7 {
    public static void main(String[] args) {
        String hh = "we found a treasure!";
        for (char i: hh.toCharArray()){
            if(i==' '){
                System.out.print(" ");
            } else if(i=='!'){
                System.out.print("!");
            }else {
                int e = ((26 - (alphabet.indexOf(i)))-1);
                System.out.print(alphabetarrya[e]);
            }
        }

    }
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static char[]alphabetarrya = alphabet.toCharArray();
}
