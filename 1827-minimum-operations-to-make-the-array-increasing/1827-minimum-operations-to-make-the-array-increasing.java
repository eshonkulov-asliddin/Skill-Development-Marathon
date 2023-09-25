class Solution {
    
    public int minOperations(int[] nums) {
        
        int operations = 0;
        
        for (int i = 1; i < nums.length; i++) {
            
            int diff = nums[i-1] - nums[i] + 1;
            
            if (diff > 0) {                
                operations += diff;
                nums[i] += diff;
            }
        }
        
        return operations;
        
    }
}

/*
    Time Complexity: O(n-1)
    Space Complexity: O(1)
*/