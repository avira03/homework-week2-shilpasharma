package javaprogram;
import java.util.Scanner;

public class program8_trianglearea {
    public static void main(String[] args) {
        trianglearea();
    }

    public static void trianglearea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base of triangle");
        float b = scanner.nextFloat();
        System.out.println("Please enter height of triangle");
        float h = scanner.nextFloat();
        scanner.close();
        float a;
        a = (0.5f * b * h);
        System.out.println("area of triangle is " + a);
    }
}
