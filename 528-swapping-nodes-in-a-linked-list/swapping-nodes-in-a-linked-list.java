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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head , slow = head ;
        ListNode left , right;
        
        for(int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        left = fast;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        right = slow;

        int t = right.val;
        right.val = left.val;
        left.val = t;

        return head;
    }
}