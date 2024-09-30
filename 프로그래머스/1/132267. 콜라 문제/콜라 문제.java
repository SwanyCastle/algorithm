class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int mod = n % a;
            int exchanged = n / a;
            n = exchanged * b + mod;
            answer += (exchanged * b);
        }

        return answer;
    }
}