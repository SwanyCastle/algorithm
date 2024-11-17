import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();
        
        int cnt = nums.length / 2;
        
        for(int n : nums) {
            numSet.add(n);
        }
        
        return numSet.size() > cnt ? cnt : numSet.size();
        
    }
}