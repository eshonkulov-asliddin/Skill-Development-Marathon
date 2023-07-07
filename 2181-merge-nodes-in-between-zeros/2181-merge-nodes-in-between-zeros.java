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
        
        ListNode dummy = new ListNode();
        ListNode pointer = dummy;
        
        boolean start = false;
        
        int curVal = 0;
        while (head != null){
            if (head.val == 0 && start){
                pointer.next = new ListNode(curVal);
                pointer = pointer.next;
                curVal = 0;
                start = false;
            }
            
            if (head.val == 0 && !start){
                start = true;
            }
                
            curVal += head.val;    
            head = head.next;
        }
        
        return dummy.next;
    }
}