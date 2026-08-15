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
        if (head.next.next == null) {
            head.next=null;
            return head;
        }

        ListNode s=head;
        ListNode f=s;
        ListNode pre=s;


        while (f.next!=null && f.next.next!=null) {
            pre = s;
            s = s.next;
            f = f.next.next;
        }

        if (f.next == null){
            delete(pre, s);
            return head;
        }
        delete(pre.next, s.next);
        return head;
    }

    public void delete(ListNode previous, ListNode node) {
        node = node.next;
        previous.next = node;
    }
}
