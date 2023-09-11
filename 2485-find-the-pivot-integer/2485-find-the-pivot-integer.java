class Solution {
    public int pivotInteger(int n) {
        
        int rangeSum = 0;
        
        for (int i = 1; i <= n; i++) rangeSum += i;
        
        
        int curSum = 0;
        for (int i = 1; i <= n; i++){
            
            curSum += i;
            
            if (curSum == rangeSum){
                return i;
            }
            
            rangeSum -= i;
            
            
        }
        
        return -1;
        
    }
}