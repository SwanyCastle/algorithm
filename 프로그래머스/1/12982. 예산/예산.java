import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = Arrays.stream(d).sum();

        if (budget >= sum) {
            return d.length;
        }

        Arrays.sort(d);

        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}