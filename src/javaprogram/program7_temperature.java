package javaprogram;

import java.util.Scanner;

public class program7_temperature {

    public static void main(String[] args) {
        temp();
    }

    public static void temp()
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please temperature in degree Fahrenheit");
        float F = scanner.nextFloat();
        scanner.close();
        float cel;
        cel = ((F-32) * 5/9 );
        System.out.println("Temp in Celsius is: "+ cel + "°C");

    }

}
