package String;

public class Atoi {
    static int atoiOfInteger(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;

        if(ch.length == 0 ) return 0;
        int  i =0;
        if(ch[i] == '-') {
            isNegative = true;
            i++;
        } else if(ch[i] == '+') {
            i++;
        }

        for (; i < ch.length; i++) {
            if(ch[i]>='0' && ch[i] <='9') {
                sb.append(ch[i]);
            } else {
                break;
            }
        }

        if (sb.length() == 0) {
            return 0;
        }

        try {
            flag = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return isNegative ? -flag : flag;
    }
    public static void main(String[] args) {
        String s = "323oioeioei";
        System.out.println(atoiOfInteger(s));;
    }
}
