package Function.concept;

public class parameterPass {
    public static void main(String[] args) {
        int ans = sum3(10,20);
        System.out.print(ans);
    }

    // Passs the value of number when you are calling the method in main()

    static int sum3(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
