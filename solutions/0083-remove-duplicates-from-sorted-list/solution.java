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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode cur=head;
        ListNode t = cur.next;

        while (cur.next != null) {
            if (cur.val == t.val) {
                while (cur.val == t.val) {
                    t = t.next;
                    if (t == null) {
                        cur.next = null;
                        return head;
                    }
                }
                cur.next = t;
            }
            t = t.next;
            cur = cur.next;
        }
        return head;
    }
}