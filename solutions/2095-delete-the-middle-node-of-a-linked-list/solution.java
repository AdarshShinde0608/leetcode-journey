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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode s=head;
        ListNode f=s;

        while (f.next!=null && f.next.next!=null) {
            s = s.next;
            f = f.next.next;
        }

        if (f.next == null){
            delete(s, head);
            return head;
        }
        delete(s.next, head);
        return head;
    }

    public void delete(ListNode node, ListNode head) {
        ListNode t=head;

        while (t.next!=node) {
            t = t.next;
        }
        node = node.next;
        t.next = node;
    }
}
