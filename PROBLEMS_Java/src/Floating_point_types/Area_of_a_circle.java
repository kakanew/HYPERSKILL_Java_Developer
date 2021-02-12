package Floating_point_types;

//Given the radius ﻿of the circle, you need to find an area of that circle. Use this formula:
//        S = \pi R^2S=πR
//        2
//        Where SS - an area of a circle, \piπ - Math.PI constant, RR - radius of the circle.
//        Sample Input 1:
//        100
//        Sample Output 1:
//        31415.926535897932

import java.util.Scanner;

public class Area_of_a_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double area = Math.PI * (radius * radius);
        // double circumference= Math.PI * 2*radius;

        System.out.println(area);
    }
}
