import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        
        for (int num : nums) {
            if (seen.containsKey(num)) {
                return true;   // duplicate found
            }
            seen.put(num, 1);  // mark as seen
        }
        
        return false;          // all elements are distinct
    }
}