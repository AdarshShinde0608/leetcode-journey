import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int index=0;
        for (char c : s.toCharArray()) {
            if (map.get(c) < 2) {
                return index;
            }
            index++;
        }
        return 0;
    }
}