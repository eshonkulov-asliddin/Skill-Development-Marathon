/*
    Time Complexity: O(n+k)
    Space Complexity: O(n+k)
*/

class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] words = s.split(" ");
        
        StringBuilder ans = new StringBuilder();
        
        int i = 0;
        while (i < k - 1) {
            ans.append(words[i++] + " ");
        }
        
        ans.append(words[i]);
        
        return ans.toString();
    }
}