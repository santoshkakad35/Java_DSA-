package Oops.Inheritance;
// multilevel inheritance

class Animal {
    void eat() {
        System.out.println("Every animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog sounds barks");
    }
}

class BabyDog extends Dog {
    void babyDog() {
        System.out.println("Dog wagging their tails");
    }
}



public class Test1 {
    public static void main(String[] args) {
        BabyDog d1 = new BabyDog();
        d1.eat();
        d1.bark();
        d1.babyDog();
    }
}
