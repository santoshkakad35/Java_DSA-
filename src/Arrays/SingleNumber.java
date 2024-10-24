package Arrays;

import java.util.HashMap;
import java.util.Map;
// 136 single number
public class SingleNumber {
    static void singleNo(int[] a) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            mp.put(a[i], mp.getOrDefault(a[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1) {
                flag = entry.getKey();
            }
        }

        System.out.println("Single element is "+flag);
    }
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        singleNo(a);

    }
}
