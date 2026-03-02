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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode result = new ListNode(0);
        ListNode r = result;
        int sum = 0;

        while(temp != null) {
            if(temp.val == 0 && sum > 0) {
                r.next = new ListNode(sum);
                sum = 0;
                r = r.next;
            }
            else 
                sum += temp.val;
            temp = temp.next;
        }
        return result.next;
        
    }
}