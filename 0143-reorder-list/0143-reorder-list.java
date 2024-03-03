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
    public void reorderList(ListNode head) {
        
        List<ListNode> fPart = new ArrayList<>();
        List<ListNode> sPart = new ArrayList<>();
           
        int n = getLength(head);
        int count = 0;
        ListNode curr = head;
        while (count < n && curr != null) {
            ListNode nxt = curr.next;
            curr.next = null;
            if (count < (n / 2)) {
                fPart.add(curr);
            }else {
                sPart.add(curr);
            }
            
            count++;
            curr = nxt;
        }
        
        int sSize = sPart.size();
        int fSize = fPart.size();
        int min = Math.min(sSize, fSize);
        int fPointer = 0;
        int sPointer = sSize - 1;
        for (int i = 0; i < n / 2; i++) {
            ListNode prev = fPointer + 1 < fSize ? fPart.get(fPointer + 1) : fSize == sSize ? null : sPart.get(0);
            head = fPart.get(fPointer++);
            head.next = sPart.get(sPointer--);
            head.next.next = prev;
            
            head = head.next.next;
        }    
        
    }
    
    public int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
/*

[]
[1,2,3,4]
[]
1
*/