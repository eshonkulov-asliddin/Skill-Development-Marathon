class Solution {
    /*
        Time Complexity: O(n+k)
        Space Complexity: O(1)
    */
    public int maximizeSum(int[] nums, int k) {
        
        
        int maxNum = findMax(nums);
        int score = 0;
        
        for (int i = 0; i < k; i++) {
            score += maxNum++;
        }
        
        return score;
        
    }
    
    public int findMax(int[] nums) {
        int maxNum = -1;
        
        for (int num : nums) {
            maxNum = Math.max(num, maxNum);
        }
        
        return maxNum;
    }
}