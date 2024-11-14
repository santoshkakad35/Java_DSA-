package Oops.Constructor;
//Constructor Overloading in Java
public class Constructor3 {
    int id;
    String name;
    int age;

    Constructor3(int i, String n) {
        id = i;
        name = n;
    }

    Constructor3(int i,String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id+" "+name+" "+age);
    }


    public static void main(String[] args) {
        Constructor3 s1 = new Constructor3(111, "Karan");
        Constructor3 s2 = new Constructor3(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
