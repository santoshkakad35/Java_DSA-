package BinerySerch;
// Leetcode 744  find smallest letter greater then target
public class FindSmallestLetterGreaterThanTarget {
    public static char Leetcode744(char[] letters, char target) {
        int st = 0, end = letters.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (letters[mid] > target) {
                end = mid - 1; // Narrow the search space to the left.
            } else {
                st = mid + 1; // Narrow the search space to the right.
            }
        }

        return letters[st % letters.length];
    }
    public static void main(String[] args) {
        char[] ch = {'c','f','j'};
        char x = 'j';
        System.out.println(Leetcode744(ch,x));
    }
}
