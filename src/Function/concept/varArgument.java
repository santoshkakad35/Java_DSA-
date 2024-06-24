package Function.concept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgument {
    public static void main(String[] args) {
        fun(2,4,5,6,7,8);
        fun(10);
        fun("sk");
    }

    // when two or more function have same name function overloading
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }



    static void fun(int ...v) { // it print array ...v
        System.out.println(Arrays.toString(v));
    }
}
