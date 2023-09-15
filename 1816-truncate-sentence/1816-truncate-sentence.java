/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    public String truncateSentence(String s, int k) {
        
        int countSpace = 0;
        int idx = 0;
        for (char ch : s.toCharArray()) {
            
            if (ch == ' ') countSpace++;
            
            if (countSpace == k) return s.substring(0, idx);
            
            idx++;
        }
        
        return s.substring(0, idx);
    }
}