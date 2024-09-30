import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> thofList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            thofList.add(score[i]);

            if (thofList.size() > k) {
                thofList.remove(Collections.min(thofList));
            }

            answer[i] = Collections.min(thofList);
        }

        return answer;
    }
}