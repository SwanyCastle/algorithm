import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> friendMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            friendMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (friendMap.containsKey(photo[i][j])) {
                    sum += friendMap.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}