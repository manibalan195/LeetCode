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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0);
        ListNode rt = result;
        ListNode t = head;

        while(t != null) {
            ListNode nb = new ListNode(0);
            int c = 1;
            ListNode sb = t;
            while(t != null && c <= k) {
                ListNode nn = new ListNode(t.val);
                nn.next = nb.next;
                nb.next = nn;
                t = t.next;
                c++;
            }
            if(c > k) {
                rt.next = nb.next;
                while(rt.next != null) rt = rt.next;
            }
            else {
                rt.next = sb;
                return result.next;
            }
        }

        return result.next;
    }
}