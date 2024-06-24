package Function.concept;

public class shadow {
    static int x = 90; // we initialize x in main class so it can be availabel for everyone
    // this is shadowed
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 89; // the class variable at line 4 is shadowed by this
        System.out.println(x);  //89
        fun();
    }

    static void fun() {
        System.out.println(x); // 90
    }

    //shadowing in java
}
