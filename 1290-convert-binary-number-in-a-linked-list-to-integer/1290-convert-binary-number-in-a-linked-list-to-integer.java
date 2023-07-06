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
        List<Integer> binaries = new ArrayList<>();
        
        while(head != null){
            binaries.add(head.val);
            head = head.next;
        }
        
        Collections.reverse(binaries);
        
        int ans = 0;
        int val = 1;
        for (int num : binaries){
            if (num == 1){
                ans += val;
            }
            val = val * 2;
        }
        return ans;
        
    }
}