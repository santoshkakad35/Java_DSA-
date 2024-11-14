package Oops.Abstractions;


abstract  class Laptop {
    public abstract void work();
    public void gaming() {
        System.out.println("Laptop is used for gaming");
    }
}

class HP extends Laptop{
    String name = "HP victus";
    public void work() {
        System.out.println(name+" is used for offical work");
    }
}
public class Test21 {
    public static void main(String[] args) {
        HP obj = new HP();
        obj.work();
        obj.gaming();
    }
}
