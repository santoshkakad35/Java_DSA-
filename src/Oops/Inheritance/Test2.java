package Oops.Inheritance;
// Hierarchical Inheritance
class Phone {
    void calling() {
        System.out.println("Phone is used for calling");
    }
}

class Vivo extends Phone {
    String brand = "vivo";
    void message() {
        System.out.println(brand +" is focus on retailer market");
    }
}

class Apple extends Phone {
    String brand = "apple";
    void design() {
        System.out.println("Apple is status");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.design();
        a1.calling();

        Vivo v1 = new Vivo();
        v1.message();
        v1.calling();
    }
}
