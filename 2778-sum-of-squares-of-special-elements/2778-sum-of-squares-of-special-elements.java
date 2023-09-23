class Solution {
    public int sumOfSquares(int[] nums) {
        
        int ans = 0;
        
        int length = nums.length;
        int i = 1;
        while (i <= nums.length) {
            
            if (length % i == 0) {
                ans += (nums[i-1]*nums[i-1]);
            }
            
            i++;
            
        }
        
        return ans;
        
    }
}