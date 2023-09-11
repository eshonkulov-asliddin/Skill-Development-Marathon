class Solution {
    public int pivotInteger(int n) {
        
        /*
            Time Complexity: O(n)
            Space Complexity: O(1)
            
            n = 1,2,3,4,5,6,7,8
                          l r
            rightSum = 15
            leftSum = 15
        */
        
        int leftSum = 0, rightSum = 0;
        
        int left = 0, right = n;
        
        while (left <= right) {
            
            if (leftSum == rightSum){
                leftSum += left + 1;
                rightSum += right;
                
                left++;
                right--;
                
            }else if (leftSum > rightSum){
                rightSum += right;
                right--;
                
            }else{
                leftSum += left + 1;
                left++;
            }
            
            
            
        }
        
        return leftSum == rightSum ? left : -1;
        
    }
}