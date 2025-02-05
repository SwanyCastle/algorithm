import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        String allowed = "aya|ye|woo|ma";
        String invalidSequence = "(ayaaya|yeye|woowoo|mama)";
        int count = 0;

        for (String word : babbling) {
            if (Pattern.compile(invalidSequence).matcher(word).find()) {
                continue;
            }
            String replaced = word.replaceAll(allowed, "");
            if (replaced.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}