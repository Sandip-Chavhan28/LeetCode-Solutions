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
    public ListNode removeElements(ListNode head, int val) {
        ListNode st = null;
        ListNode end = null;
        while(head != null){
            if(head.val != val){
                if(st == null){
                    st = end= new ListNode(head.val,null);
                }else{
                    end.next = new ListNode(head.val,null);
                    end = end.next;
                }
            }
            head = head.next;
            
            // if(head.val != val){
            //     if(st == null){
            //         st = end = new ListNode(head.val,null);
            //         head = head.next;
            //         continue;
            //     }
            //     end.next = new ListNode(head.val,null);
            //     end = end.next;
            // }
            // head = head.next;
        }
        return st;
    }
}