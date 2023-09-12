class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int maxId = -1, maxNum = -1;
        
        
        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            if (curNum > maxNum) {
                maxNum = curNum;
                maxId = i;
            }
        }
        
        
        int score = 0;
        
        for (int i = 0; i < k; i++) {
            score += maxNum++;
        }
        
        return score;
        
    }
}