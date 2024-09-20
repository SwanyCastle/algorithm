class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int diff = 'z' - 'a' + 1;
        char[] chArr = s.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] != ' ') {
                if (chArr[i] >= 'a' && chArr[i] <= 'z') {
                    chArr[i] += (char) n;

                    if (chArr[i] > 'z') {
                        chArr[i] -= (char) diff;
                    }
                } else if (chArr[i] >= 'A' && chArr[i] <= 'Z') {
                    chArr[i] += (char) n;

                    if (chArr[i] > 'Z') {
                        chArr[i] -= (char) diff;
                    }
                }
            }
        }
        answer = new String(chArr);

        return answer;
    }
}