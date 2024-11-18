class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorArr = new int[number + 1];
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            for(int j = i; j <= number; j += i) {
                divisorArr[j]++;
            }
        }
        
        for (int i = 1; i <= number; i++) {
            if(divisorArr[i] > limit) {
                answer += power;
                continue;
            }
            answer += divisorArr[i];
        }
        
        return answer;
    }
}