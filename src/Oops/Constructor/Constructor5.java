package Oops.Constructor;

public class Constructor5 {
    int id;
    String name;

    Constructor5(int i, String n) {
        id = i;
        name = n;
    }

    Constructor5() {}

    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Constructor5 s1 = new Constructor5(11,"Sk");
        Constructor5 s2 = new Constructor5();
        s2.id = s1.id;
        s2.name = s1.name;

        s1.display();
        s2.display();
    }
}
