package javaprogram;
// Java program to swap two variables.
public class program15_swap {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int s = a;
        a = b;
        b =s;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
