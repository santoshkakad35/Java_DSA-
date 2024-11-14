package Oops;
// method overriding
class Animal {
    public void eat() {
        System.out.println("Animal can eat effectively");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer eat grass ... ");
    }
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats meet ...");
    }
}

public class Test07 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Deer d1 = new Deer();
        Lion l1 = new Lion();

        a1.eat();
        d1.eat();
        l1.eat();
    }
}
