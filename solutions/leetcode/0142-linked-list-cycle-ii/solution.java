/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f;
        f = s;

        if (f==null || f.next==null || f.next.next==null) return null;

        s = s.next;
        f = f.next.next;
        while (f.next!=null && f.next.next!=null) {
            if (s == f) {
                s = head;
                while (s != f) {
                    f=f.next;
                    s=s.next;
                }
                return s;
            }
            f=f.next.next;
            s=s.next;
        }
        return null;
    }
}