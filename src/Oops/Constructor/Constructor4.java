package Oops.Constructor;
//Copying values  constructor
public class Constructor4 {
    int id;
    String name;

    Constructor4(int i,String n) {
        id = i;
        name = n;
    }

    Constructor4(Constructor4 z) {
        id = z.id;
        name = z.name;
    }

    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Constructor4 c1 = new Constructor4(11,"sk");
        Constructor4 c2 = new Constructor4(c1);
        c1.display();
        c2.display();
    }
}
