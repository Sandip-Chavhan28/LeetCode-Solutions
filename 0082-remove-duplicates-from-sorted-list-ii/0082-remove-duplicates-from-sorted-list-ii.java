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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head != null){
            ListNode curr = head;
            int count = 0;
            while(head != null && curr.val == head.val){
                count++;
                head = head.next;
            }
            if(count == 1){
                temp.next = curr;
                temp = temp.next;
                temp.next = null;
            }
        }
        return dummy.next;
    }
}