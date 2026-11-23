class Solution {
    public boolean isAnagram(String s, String t) {
        // Lengths must match
        if (s.length() != t.length()) return false;
        
        int[] count = new int[26];
        
        // Increment for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        // All counts must be zero
        for (int c : count) {
            if (c != 0) return false;
        }
        
        return true;
    }
}
