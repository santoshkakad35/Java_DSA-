package Function.concept;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//            int a = 90; // error we can't reinitialize
            a = 89; // we can modify
            System.out.println(a);
            int c = 99;
            // value initialize in this block , will remain in block
        }
//        System.out.println(c); // we can't access c it is out of scope

        // Anything initialize outside you can't reinitialized but modify
        // but anything initialize inside you can't use ouside
        // but you can initialize the same one outside that is inside it not show error
    }

}
