class Solution {
    
    public int minOperations(int[] nums) {
        
        int operations = 0;
        
        for (int i = 1; i < nums.length; i++) {
            
            int operation = nums[i-1] - nums[i];
            
            if (operation >= 0) {
                //in order make strictly increasing, we need to add 1 to current operation
                nums[i] = nums[i] + operation + 1;
                operations += operation + 1;
            }
        }
        
        return operations;
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/