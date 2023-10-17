package javaprogram;

import java.util.Scanner;

public class program9_uppertolower {
    public static void main(String[] args) {
        casechage();
    }

    public static void casechage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter uppercase string");
        String s = scanner.nextLine();
        scanner.close();
        String u;
        u = s.toLowerCase();
        System.out.println(u);


    }
}
