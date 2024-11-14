package Oops;

// method overloading

class Operations {
//    static void add(int a, int b) {
//        System.out.println("Additions is "+(a+b));
//    }
//
//    static void add(int a, int b , int c) {
//        System.out.println("Additions is "+(a+b+c));
//    }
//
//    static void add(float a, float b) {
//        System.out.println("Additions is "+(a+b));
//    }


    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    public void add(float a, float b) {
        System.out.println(a+b);
    }


}

class Test06 {
    public static void main(String[] args) {
//        Operations.add(10, 20);
//        Operations.add(10,20,30);
//        Operations.add(5.10f,2.10f);

        Operations o1 = new Operations();
        o1.add(10, 20);
        o1.add(5, 10, 40);
        o1.add(9.3f,9.2f);
    }
}