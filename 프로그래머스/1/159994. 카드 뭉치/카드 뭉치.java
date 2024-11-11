import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardsQ1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardsQ2 = new LinkedList<>(Arrays.asList(cards2));
        
        for (int i = 0; i < goal.length; i++) {
            if (!cardsQ1.isEmpty() && goal[i].equals(cardsQ1.peek())) {
                cardsQ1.poll();
            } else if (!cardsQ2.isEmpty() && goal[i].equals(cardsQ2.peek())){
                cardsQ2.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
