package Arrays;

public class firstSecThirdMax {
    static void checkMax(int[] arr) {
        int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num>second && num!=first) {
                third = second;
                second = num;
            } else if(num>third && num!=first && num!=second){
                third = num;
            }

        }
        System.out.println("Third Max : "+third);
    }

    static void checkMax2(int[] arr) {
        int first = Integer.MAX_VALUE,second = Integer.MAX_VALUE,third = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num<second && num!=first) {
                third = second;
                second = num;
            } else if(num<third && num!=first && num!=second){
                third = num;
            }

        }
        System.out.println("Third Max : "+third);
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 5, 10, 34, 1, 50};
        checkMax2(arr);
        checkMax(arr);
    }
}
