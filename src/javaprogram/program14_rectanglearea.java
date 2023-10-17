package javaprogram;
import java.util.Scanner;
public class program14_rectanglearea {
    public static void main(String[] args) {
        area();
    }

    public static void area() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter width of rectangle");
        float w = scanner.nextFloat();
        System.out.println("Please enter height of rectangle");
        float h = scanner.nextFloat();
        scanner.close();
        float area;
        area= w*h;
        float p;
        p=2 * (w+h);
        System.out.println("area  "+ area);
        System.out.println("perimeter " + p);
    }
}
