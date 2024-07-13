package Function.concept;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.print(a + " " + b);

        String name = "sk";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "NK";
        System.out.println(naam);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // basically swaping not occurs

        System.out.println(a);
        System.out.println(b);
    }

}
