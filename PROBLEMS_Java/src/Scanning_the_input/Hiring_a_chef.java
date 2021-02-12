package Scanning_the_input;

//Imagine that you are an HR manager at a restaurant and you need to hire a chef.
//        To do that, you need to collect some preliminary data about the candidates.
//        You have a special form for the candidates that includes 5 fields: first name,
//        age, stage of education, years of experience, cuisine preference.
//        Your program should read all the words (or numbers) from the five lines and output
//        "The form for first name is completed. We will contact you if we need a chef that cooks cuisine preference dishes."
//        Sample Input 1:
//        Eugene
//        33
//        secondary
//        8
//        fusion
//        Sample Output 1:
//        The form for Eugene is completed. We will contact you if we need a chef that cooks fusion dishes.

import java.util.Scanner;

public class Hiring_a_chef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisinePreference = scanner.next();

        System.out.print("The form for ");
        System.out.print(firstName);
        System.out.print(" is completed. We will contact you if we need a chef that cooks ");
        System.out.print(cuisinePreference);
        System.out.print(" dishes.");
    }
}

