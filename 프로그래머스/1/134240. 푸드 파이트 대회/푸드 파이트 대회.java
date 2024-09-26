import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, Integer> foodMap = new HashMap<>();

        for (int i = 1; i < food.length; i++) {
            foodMap.put(i, food[i] / 2);
        }

        for (int i = 1; i < food.length; i++) {
            String s = String.valueOf(i);
            Integer count = foodMap.get(i);
            answer.append(s.repeat(count));
        }

        answer.append("0");

        for (int i = food.length - 1; i > 0; i--) {
            String s = String.valueOf(i);
            Integer count = foodMap.get(i);
            answer.append(s.repeat(count));
        }

        return answer.toString();
    }
}