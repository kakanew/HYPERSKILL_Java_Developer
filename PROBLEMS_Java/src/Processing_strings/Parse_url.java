package Processing_strings;

//You want to hack a website now. First, get all the available parameters that you can find in the URL.
//        Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".
//        If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However, if pass parameter is present, its value cannot be empty.
//        Note: the order of parameters should be the same as in the URL.
//        Advice: Check examples for better understanding and carefully learn the structure of the URL.
//        Sample Input 1:
//        https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
//        Sample Output 1:
//        pass : 12345
//        port : 8080
//        cookie : not found
//        host : localhost
//        password : 12345
//        Sample Input 2:
//        https://target.com/index.html?port=8080&cookie=&host=localhost
//        Sample Output 2:
//        port : 8080
//        cookie : not found
//        host : localhost

import java.util.Scanner;

public class Parse_url {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String str1 = str.substring(30);
        String[] str2 = str1.split("&");
        String pass = "none";


        for (String s : str2) {
            String[] s1 = s.split("=");
            if (s1.length == 1) {
                String[] s2 = {s1[0], "not found"};
                System.out.println(s2[0] + " : " + s2[1]);
            } else {
                System.out.println(s1[0] + " : " + s1[1]);
            }
            if (s1[0].equals("pass")) {
                pass = s1[1];
            }

        }
        if (!"none".equals(pass)) {
            System.out.println("password : " + pass);
        }
    }
}
