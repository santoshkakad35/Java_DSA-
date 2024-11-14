package Oops;
//Initialization through method


class Engineer {
    int roll;
    String name;

    public void insert(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Engineer roll no is "+roll+" & name is "+name);
    }
}
public class Test03
{
    public static void main(String[] args) {
        Engineer obj = new Engineer();
        obj.insert(10, "abc");
        obj.display();
    }
}
