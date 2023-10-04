class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int length = nums.length;
                
        int start = 0, end = length - 1;
        
        while (start < end) {
                        
            // if curNum is odd we have to rearrange it with the even 
            if (nums[start] % 2 != 0) {
                
                int endNum = nums[end];
                
                // we find the first even from last
                while (nums[end] % 2 != 0 && end > start){
                    end--;
                }
                
                // swap start odd to end even
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                
                end--;
            }
            
            start++;
        }
        
        return nums;
        
    }
    
    
/*
    Optimized Solution Two Pointer Approach
    Time Complexity: O(n)
    Space Complexity: O(1) 
*/
}


/*
    First Solution
    Time Complexity: O(n)
    Space Complexity: O(n) if we count output array
*/
    
        
//         for (int num : nums) {
//             if (num % 2 == 0){
//                 ans[start++] = num;
                
//             }else {
//                 ans[end--] = num;
//             }
//         }
        
        
//         return ans;