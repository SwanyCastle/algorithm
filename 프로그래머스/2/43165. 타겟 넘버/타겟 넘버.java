import java.util.*;

class Solution {
    List<Integer> allWay = new ArrayList<>();
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        getAllWaysByDoingPlusOrMinus(numbers, 0, 0);
        for (Integer way : allWay) {
            if (way == target) {
                answer += 1;
            }
        }
        return answer;
    }
    
    public void getAllWaysByDoingPlusOrMinus(int[] numbers, int currentIdx, int currentSum) {
        if (currentIdx == numbers.length) {
            allWay.add(currentSum);
            return;
        }
        getAllWaysByDoingPlusOrMinus(numbers, currentIdx + 1, currentSum + numbers[currentIdx]);
        getAllWaysByDoingPlusOrMinus(numbers, currentIdx + 1, currentSum - numbers[currentIdx]);
    }
}