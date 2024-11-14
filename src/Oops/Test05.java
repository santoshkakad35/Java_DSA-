package Oops;

//a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects

// method
public class Test05 {
    static void writing() {
        System.out.println("Pen is used for writing");
    }

    public void fun() {
        System.out.println("Pen is used for sign");
    }

    public static void main(String[] args) {
        Test05 pen = new Test05();
        pen.fun();
        writing();
    }
}
