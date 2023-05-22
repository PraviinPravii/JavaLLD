package Overloading;

public class Student {

    int a = 9;

    // void add(int a, int b) {
    // System.out.println(a + b);
    // }

    // void add(double a, int b) {
    // System.out.println(a + b);
    // }

    // void add(int a, double b) {
    // System.out.println(a + b);
    // }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, double b, int c) {
        System.out.println(a + b + c);
    }

}
