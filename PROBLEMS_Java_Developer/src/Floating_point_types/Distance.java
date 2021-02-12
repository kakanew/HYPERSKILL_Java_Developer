package Floating_point_types;

//Write a program that reads the distance between the two cities in miles
//        and the travel time by bus in hours, and outputs the average speed of the bus.
//        Note: there is NO need to give any explanations during input and output.
//        Sample Input 1:
//        100
//        2
//        Sample Output 1:
//        50.0

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double hour = scanner.nextDouble();

        double speed = distance / hour;

        System.out.println(speed);
    }
}
