class Solution {
    public int pivotInteger(int n) {
        
        /*
            Time Complexity: O(n)
            Space Complexity: O(1)
        */
        
        int allSum = 0;
        
        for (int i = 1; i <= n; i++) allSum += i;
        
        
        int curSum = 0;
        for (int i = 1; i <= n; i++){
            
            curSum += i;
            
            if (curSum == allSum){
                return i;
            }
            
            allSum -= i;
            
            
        }
        
        return -1;
        
    }
}