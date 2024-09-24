import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numberSet.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> numberList = new ArrayList<>(numberSet);
        int[] answer = new int[numberList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = numberList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}