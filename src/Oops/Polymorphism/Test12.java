package Oops.Polymorphism;
// method overloading
class Add{
    static int add(int a, int b) {
        return a+b;
    }

    static double add(double a,double b) {
        return a+b;
    }
}
public class Test12 {
    public static void main(String[] args) {
        System.out.println(Add.add(10, 20));
        System.out.println(Add.add(1.5,1.0));
    }
}
