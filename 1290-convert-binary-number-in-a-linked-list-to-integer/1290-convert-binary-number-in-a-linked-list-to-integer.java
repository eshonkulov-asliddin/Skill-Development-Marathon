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
    public int getDecimalValue(ListNode head) {
        
        ListNode prev = null;
        while(head != null){
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
        }
    
        
        int ans = 0;
        int val = 1;
        while (prev != null){
            if (prev.val == 1){
                ans += val;
            }
            val = val * 2;
            prev = prev.next;
        }
    
        return ans;
        
    }
}