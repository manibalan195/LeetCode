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
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = null;
        ListNode t = head;
        while(t != null) {
            ListNode temp = result.next;
            result.next = new ListNode(t.val);
            result.next.next = temp;
            t  = t.next;

        }
        return result.next;
    }
}