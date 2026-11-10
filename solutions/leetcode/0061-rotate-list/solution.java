class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: empty list, single node, or no rotation needed
        if (head == null || head.next == null || k == 0) return head;

        // Find the length of the list and the tail node
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Reduce k in case it's larger than the list length
        k = k % n;
        if (k == 0) return head;

        // Find the new tail: it's at index (n - k - 1) from the head
        ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;   // break the link
        tail.next = head;      // reconnect the old tail to the old head

        return newHead;
    }
}