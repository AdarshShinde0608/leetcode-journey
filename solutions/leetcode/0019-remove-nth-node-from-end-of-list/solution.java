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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            head = null;
            return head;
        }

        else if (head.next.next == null) {
            if (n==1) {

            }
        }

        else {
            ListNode curr=head;
            ListNode tmp=head;

            while (true) {
                tmp = tmp.next;
                if (n!=0) {
                    n--;
                    continue;
                }
                if (tmp.next == null) {
                    break;
                }
                curr = curr.next;
            }
            tmp = curr.next.next;
            curr.next = tmp;
            
            return head;
        }
        return head;
    }
}