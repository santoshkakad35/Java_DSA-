package String;

import java.util.HashSet;

public class UniqueEmailAddresses {
    static int validEmail(String[] str) {
        HashSet<String> set = new HashSet<>();
        for(String st : str) {
            int AtRatePos = st.indexOf("@");
            String localName = st.substring(0, AtRatePos);
            String domainName = st.substring(AtRatePos);

            localName = st.replaceAll("\\.","");
            if(localName.contains("+")) {
                int plusPos = localName.indexOf('+');
                localName = localName.substring(0,plusPos);
            }

            st = localName + domainName;
            set.add(st);
        }
        return set.size();
    }
    public static void main(String[] args) {
        String[] str = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(validEmail(str));;
    }
}
