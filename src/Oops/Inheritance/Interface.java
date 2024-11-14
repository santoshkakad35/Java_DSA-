package Oops.Inheritance;
// so multiple inheritance is achived by interface
interface  X {
    default void msg() {
        System.out.println("Hello");
    }
}

interface Y{
    default void msg()  {
        System.out.println("hello");
    }
}

class Z implements X,Y {
    public void myMethod() {
        System.out.println("My method");
    }

    @Override
    public void msg() {
        X.super.msg();
        Y.super.msg();
    }
}

public class Interface {
    public static void main(String[] args) {
        Z z = new Z();
        z.msg();
        z.myMethod();

    }
}
