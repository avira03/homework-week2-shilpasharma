package javaprogram;

public class program3 {
    int a =  2;
    static int b = 3;

    public static void main(String[] args) {
        program3 p3 = new program3() ;
        p3.test1();
        test2();
    }

    public void test1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void test2(){
        program3 p3 = new program3();
        System.out.println(p3.a);
        System.out.println(b);

    }
}
