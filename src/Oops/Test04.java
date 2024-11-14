package Oops;

//Object and Class Example: Rectangle

class Rectangle {
    int length;
    int breath;

    void size(int l, int b) {
        length = l;
        breath = b;
    }

    void display() {
        System.out.println("The rectangle area is "+ length*breath);
    }
}
public class Test04 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.size(5,2);
        r1.display();
    }

}
