package javaprogram;

import java.util.Scanner;

public class program10_table {
    public static void main(String[] args) {
        table();
    }

    public static void table(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for table");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(n + "x1=" + n);
        System.out.println(n + "x2=" +  n * 2 );
        System.out.println(n + "x3=" +  n * 3 );
        System.out.println(n + "x4=" +  n * 4 );
        System.out.println(n + "x5=" +  n * 5 );
        System.out.println(n + "x6=" +  n * 6 );
        System.out.println(n + "x7=" +  n * 7 );
        System.out.println(n + "x8=" +  n * 8 );
        System.out.println(n + "x9=" +  n * 9 );
        System.out.println(n + "x10=" +  n * 10 );



    }
}
