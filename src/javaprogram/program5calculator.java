package javaprogram;

import java.util.Scanner;

public class program5calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 of 2 numbers ");
        int a = scanner.nextInt();
        System.out.println("Please enter 2 of 2 numbers ");
        int b = scanner.nextInt();
        scanner.close();
        sum(a,b);
        sub(a,b);

        program5calculator p = new program5calculator();
        p.multiply(a,b);
        p.division(a,b);

    }

    public static void sum(int a, int b) {
        int r;
        r= a+ b;
        System.out.println("sum "+r);

    }
    public static void sub(int a, int b) {
        int r;
        r= a - b;
        System.out.println("subtract "+r);

    }
    public void multiply(int a, int b) {
        int r;
        r= a * b;
        System.out.println("multiply "+r);

    }

    public void division(int a, int b) {
        float r;
        r= a/b;
        System.out.println("division "+r);

    }



}
