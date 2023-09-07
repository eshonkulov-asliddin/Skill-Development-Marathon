class Solution {
    
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    
    public int minSwaps(String s) {
        
        int close = 0, maxClose = 0;
        
        for (char ch : s.toCharArray()){
            
            if (ch == '['){
                close--;
            }else {
                close++;
            }
            
            maxClose = Math.max(close, maxClose);
        }
        
        return (maxClose + 1) / 2;
    }
}