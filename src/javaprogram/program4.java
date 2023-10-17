package javaprogram;

public class program4 {
    int a = 4;
    int b = 3;
    static int c = 2;
    static int d = 1;


    public static void main(String[] args) {
        program4 p4 = new program4();
        p4.test1();
        test2();

    }

    public void test1() {
        program4 p4 = new program4();
        System.out.println(p4.a);
        System.out.println(p4.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void test2() {
        program4 p4 = new program4();
        System.out.println(p4.a);
        System.out.println(p4.b);
        System.out.println(c);
        System.out.println(d);
    }
}