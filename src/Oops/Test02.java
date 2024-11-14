package Oops;
/*3 Ways to initialize object
There are 3 ways to initialize object in Java.

By reference variable
By method
By constructor*/

//Initialization through reference

class Employee {
    int id;
    String name;
}


public class Test02 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.id = 19;
        obj.name = "xyz";

        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
