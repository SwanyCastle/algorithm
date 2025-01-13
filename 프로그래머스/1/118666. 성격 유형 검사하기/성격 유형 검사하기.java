import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
Map<Integer, Integer> chociesMap = new HashMap<>(
                Map.of(
                        1, 3,
                        2, 2,
                        3, 1,
                        4, 0,
                        5, 1,
                        6, 2,
                        7, 3
                )
        );

        Map<String, Integer> personalityTypeMap = new HashMap<>(
                Map.of(
                        "R", 0,
                        "T", 0,
                        "C", 0,
                        "F", 0,
                        "J", 0,
                        "M", 0,
                        "A", 0,
                        "N", 0
                )
        );

        for (int i = 0; i < choices.length; i++) {
            String[] splitType = survey[i].split("");
            if (choices[i] > 4) {
                personalityTypeMap.put(splitType[1], personalityTypeMap.get(splitType[1]) + chociesMap.get(choices[i]));
            } else if (choices[i] < 4) {
                personalityTypeMap.put(splitType[0], personalityTypeMap.get(splitType[0]) + chociesMap.get(choices[i]));
            }
        }

        StringBuilder sb = new StringBuilder();

        if (personalityTypeMap.get("R") >= personalityTypeMap.get("T")) {
            sb.append("R");
        } else {
            sb.append("T");
        }

        if (personalityTypeMap.get("C") >= personalityTypeMap.get("F")) {
            sb.append("C");
        } else {
            sb.append("F");
        }

        if (personalityTypeMap.get("J") >= personalityTypeMap.get("M")) {
            sb.append("J");
        } else {
            sb.append("M");
        }

        if (personalityTypeMap.get("A") >= personalityTypeMap.get("N")) {
            sb.append("A");
        } else {
            sb.append("N");
        }

        return sb.toString();
    }
}