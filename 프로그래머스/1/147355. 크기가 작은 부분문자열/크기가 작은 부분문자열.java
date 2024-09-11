import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        long pInt = Long.parseLong(p);
        List<Long> list = new ArrayList<>();

        for (int i = 0; i <= t.length() - pLength; i++) {
            long subLong = Long.parseLong(t.substring(i, pLength + i));
            if (subLong <= pInt) list.add(subLong);
        }

        return list.size();
    }
}