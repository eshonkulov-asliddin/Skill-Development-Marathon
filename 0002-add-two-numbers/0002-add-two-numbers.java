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

/*
      Time Complexity: O(max(n, m))
      Space Complexity: O(max(n, m)) => if we count output list as an extra space
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        
        while (l1 != null || l2 != null || carry != 0){
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;

            int curSum = a + b + carry;
            
            carry = curSum / 10;
            cur.next = new ListNode(curSum % 10);
            cur = cur.next;
            
            if (l1 != null){
                l1 = l1.next;
            }
            
            if(l2 != null){
                l2 = l2.next;
            }
        }
      
        
        return dummy.next;
        
    }
}