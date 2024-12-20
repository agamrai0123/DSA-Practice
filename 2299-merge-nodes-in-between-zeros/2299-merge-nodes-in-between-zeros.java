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
        if(head == null || head.next == null) return head;
        ListNode curr = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        int sum = 0;
        while(curr != null){
            sum = sum + curr.val;
            if(curr.val == 0){
                dummy.next = new ListNode(sum);
                sum = 0;
                dummy = dummy.next;
            }
            curr = curr.next;
        }
        return newHead.next;
    }
}