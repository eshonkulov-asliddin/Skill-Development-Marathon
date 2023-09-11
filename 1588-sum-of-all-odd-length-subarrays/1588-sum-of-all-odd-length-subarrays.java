class Solution {
    
    /*
        Time Complexity: O(n**2)
        Space Complexity: O(1)
    */
    
    public int sumOddLengthSubarrays(int[] arr) {
        
        int finalSum = 0;
        
        for (int i = 0; i < arr.length; i++){
            
            int curSum = 0;
            int length = 0;
            
            for (int j = i; j < arr.length; j++){
                
                curSum += arr[j];
                length += 1;
                
                if (length % 2 != 0) {
                    
                    finalSum += curSum; 
                }
                
            }
        }
        
        return finalSum;
        
    }
}