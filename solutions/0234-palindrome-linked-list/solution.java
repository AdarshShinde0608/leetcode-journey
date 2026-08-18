class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        
        // Store all values in ArrayList
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        
        // Check if palindrome
        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (values.get(left) != values.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}