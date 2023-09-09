/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
    Time Complexity: O(max(n, m))
    Space Complexity: O(max(n, m))
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        
        ListNode l1Reversed = reverse(l1);
        ListNode l2Reversed = reverse(l2);
        
        int carry = 0;
        
        while (l1Reversed != null || l2Reversed != null || carry != 0) {
            int x = l1Reversed != null ? l1Reversed.val : 0;
            int y = l2Reversed != null ? l2Reversed.val : 0;
            
            int curSum = x + y + carry;
            
            carry = curSum / 10;
            cur.next = new ListNode(curSum % 10);
            cur = cur.next;
            
            if (l1Reversed != null){
                l1Reversed = l1Reversed.next;
            }
            if (l2Reversed != null){
                l2Reversed = l2Reversed.next;
            }
            
        }
        
        return reverse(dummy.next);
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
        }
        
        return prev;
    }

}