package Oops.Inheritance;
// single level inheritance
class Vehicle {
    protected String brand = "ford";
    public void speed() {
        System.out.println("Ford has not speed it is family car");
    }
}
public class Car extends  Vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed();
        System.out.println("Brand is "+c1.brand+" model name is "+c1.modelName);
    }

}
