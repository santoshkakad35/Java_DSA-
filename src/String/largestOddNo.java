package String;

public class largestOddNo {
    static String largetOdd(String st) {
        for(int i=st.length()-1;i>=0;i--) {
            int d = st.charAt(i) - '0';
            if(d%2!=0) {
                return st.substring(0, i+1);
            }
        }

        return " ";
    }
    public static void main(String[] args) {
        String st = "541423";
        System.out.println(largetOdd(st));
    }
}
