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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode dummy = temp.next;
        head = temp.next;
        ListNode prev = temp ;
        boolean isfirst = true;
        while(temp.next != null && dummy != null){
            temp.next = dummy.next;
            dummy.next = temp;
            if(!isfirst){
                prev.next = dummy;
            }
            prev = temp;
            temp = temp.next;
            if(temp == null){
                break;
            }
            dummy = temp.next;
            isfirst = false;
        }
        return head;
    }
}