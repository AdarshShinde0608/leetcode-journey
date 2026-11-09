/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode find(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode half(ListNode head) {
        ListNode mid = find(head);
        ListNode curr = mid.next;
        ListNode nexttmp = null;
        ListNode prev = null;

        while (curr != null) {
            nexttmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexttmp;
        }
        mid.next = prev;
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode prev = half(head);
        ListNode slow = head;
        ListNode fast = prev;
        ListNode slowtmp = head;
        ListNode fasttmp = head;
        ListNode tmp = null;

        while (fast != null) {
            slowtmp = slow.next;
            fasttmp = fast.next;
            slow.next = fast;
            if (tmp!=null) tmp.next = slow;
            tmp = fast;
            slow = slowtmp; fast = fasttmp;
        }
        if (prev != slow) {
            tmp.next = slow;
            slow.next = null;
        }
    }
}