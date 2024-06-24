package Function.concept;

public class parameterPassString {
    public static void main(String[] args) {
        String personal = myGreet("Sk");
        System.out.println(personal);
    }

    static String myGreet(String greet) {
        String message = "Hello "+ greet;
        return message;
    }
}
