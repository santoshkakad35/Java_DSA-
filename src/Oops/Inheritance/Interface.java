package Oops.Inheritance;
// so multiple inheritance is achived by interface
interface  X {
    void print();
}

interface Y{
    void show();
}

class Z implements X,Y {
    public void myMethod() {
        System.out.println("My method");
    }

    public void print() {
        System.out.println("Painting is good");
    }

    public void show() {
        System.out.println("Painting showing is amazing");
    }
}

public class Interface {
    public static void main(String[] args) {
        Z z = new Z();
        z.print();
        z.show();

    }
}
