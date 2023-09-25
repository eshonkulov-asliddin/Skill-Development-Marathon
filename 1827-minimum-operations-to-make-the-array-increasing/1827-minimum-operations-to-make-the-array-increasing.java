class Solution {
    
    public int minOperations(int[] nums) {
        
        int operations = 0;
        
        for (int i = 1; i < nums.length; i++) {
            
            int prevNum = nums[i-1];
            int curNum = nums[i];
            
            while (curNum <= prevNum){
                curNum++;
                operations++;
            }
            // update num
            nums[i] = curNum;
        }
        
        return operations;
        
    }
}

/*
    Time Complexity: O(n* abs(m-l)) where m = prevnum within array, l = curnum within array
    Space Complexity: O(1)
*/