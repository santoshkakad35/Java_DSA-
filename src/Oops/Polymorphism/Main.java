package Oops.Polymorphism;
// run time polymorphism
class Animal {
    public void animalSound() {
        System.out.println("Animal sound is on another ");
    }
}

class Tiger extends Animal {
    public void animalSound() {
        System.out.println("Tiger is King of West Bengal");
    }
}

class Lion extends Animal {
    public void animalSound() {
        System.out.println("Lion is king of jungle");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal s1 = new Animal();
        Animal s2 = new Tiger();
        Animal s3 = new Lion();

        s1.animalSound();
        s2.animalSound();
        s3.animalSound();


    }
}


