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
        
        ListNode dummy = new ListNode(0, head);
        
        ListNode left = dummy;
        ListNode right = head;
        
        while (n > 0 && right != null) {
            right = right.next;
            n -= 1;
        }
        
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        
        left.next = left.next.next;
      
        return dummy.next;
    
    }
}

/*         
 prev = 1
                 ->
 head = [1,2,3,4,5], n = 2
             ->
 
           ->
 head = [1,2], n = 1
         ->

            ->
jead = [1,2], n = 2
        ->
*/