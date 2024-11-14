package Oops.Constructor;
// parametrized constructor
public class Constructor2 {
    int model;
    String name;

    public Constructor2(int model, String name) {
        model = model;
        name = name;
        System.out.println("Model is "+model+" & name is "+name);

    }

    public static void main(String[] args) {
        Constructor2 cars = new Constructor2(2199, "MercedesBenz");
    }
}
