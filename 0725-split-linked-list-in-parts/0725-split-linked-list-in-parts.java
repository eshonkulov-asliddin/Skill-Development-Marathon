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

Time Complexity: O(n)
Space Complexity: O(k)
*/
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] res = new ListNode[k];
        
        int length = getLength(head);
        int nodeSizeInEachIdx = length / k;
        int firstNElements = length % k;
        
        
        int count = 1;
        int i = 0;
        
        while (head != null){
            ListNode curNodeList = head;
            int extraNode = firstNElements > 0 ? 1 : 0;
            while (count < nodeSizeInEachIdx + extraNode && head.next != null ){
                count++;
                head = head.next; 
            }
            
            ListNode nxt = head.next;
            head.next = null;
            res[i] = curNodeList;
            head = nxt;
            
            i++;
            count = 1;
            firstNElements--;
        }
        
        return res;
        
    }
    
    public int getLength(ListNode head){
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}