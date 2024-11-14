package Oops.Polymorphism;
// method overloading
class Adder {
    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a , int b, int c) {
        return a+b+c;
    }
}
public class Test11 {
    public static void main(String[] args) {
        System.out.println(Adder.add(10, 20));
        System.out.println(Adder.add(10,20,30));
    }
}
