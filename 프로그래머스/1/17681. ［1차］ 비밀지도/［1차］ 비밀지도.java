class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String num = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            num = num.replace("1", "#");
            answer[i] = num.replace("0", " ");
        }

        return answer;
    }
}