package javaprogram;

import java.util.Scanner;

public class program13_average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 of 3 numbers");
        float a = scanner.nextFloat();
        System.out.println("Please enter 2 of 3 numbers");
        float b = scanner.nextFloat();
        System.out.println("Please enter 3 of 3 numbers");
        float c = scanner.nextFloat();
        scanner.close();

        float r;
        r = (a+b+c)/3;
        System.out.println(r);

    }
}
