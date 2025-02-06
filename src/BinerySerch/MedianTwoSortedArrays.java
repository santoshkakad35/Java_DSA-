package BinerySerch;
// Leetcode 4;
public class MedianTwoSortedArrays {
    static double Leetcode4(int[] n1,int[] n2) {
        int i=0,j=0,k=0;
        int[] res = new int[n1.length+n2.length];
        while(i<n1.length && j<n2.length) {
            if(n1[i]<= n2[j]) {
                res[k++] = n1[i++];
            } else {
                res[k++] = n2[j++];
            }
        }
        while(i<n1.length) {
            res[k++] = n1[i++];
        }

        while(j<n2.length) {
            res[k++] = n2[j++];
        }

        int total = res.length;
        if(total % 2 == 1) {
            return res[total / 2];
        } else {
            return (res[total/2 - 1] + res[total / 2])/2.0;
        }
    }
    public static void main(String[] args) {
        int[] n1 = {1, 2};
        int[] n2 = {3,4};
        System.out.println(Leetcode4(n1,n2));;
    }
}
