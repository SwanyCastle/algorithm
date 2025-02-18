class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] numStr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numStr.length; i++) {
            max = Math.max(max, Integer.parseInt(numStr[i]));
            min = Math.min(min, Integer.parseInt(numStr[i]));
        }

        sb.append(min).append(" ").append(max);

        return sb.toString();
    }
}