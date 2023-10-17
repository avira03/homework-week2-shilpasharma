package javaprogram;

import java.util.Scanner;

public class program6_circleArea {

    public static void main(String[] args) {
        circlearea();
    }

    public static void circlearea()
    {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter radius");
        float r = scanner.nextFloat();
        scanner.close();
        float pi = 3.14F;
        float area;
        area = pi*r*r;
        System.out.println("circle area is: " + area);
    }
}
