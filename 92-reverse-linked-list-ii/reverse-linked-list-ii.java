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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ln, t = head;
        int lc = 1 , rc = left - 1;
        ListNode temp = new ListNode(0);
        ln = temp;

        while(lc < left  && t != null) {
            ln.next = new ListNode(t.val);
            ln = ln.next;
            t = t.next;
            lc++;
        }
        
        ListNode l = null;
        while (rc < right && t != null) {
            ListNode curr = new ListNode(t.val);
            curr.next = ln.next;
            ln.next = curr;
            t = t.next;
            rc++;
        } 
        while(ln.next != null) ln = ln.next;
        while(t != null) {
            ln.next = new ListNode(t.val);
            ln = ln.next;
            t = t.next;
        }

        return temp.next;
    }
}