class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
                
        int maxCount = 0;
        int count = 0;
        for (int r = 1; r < nums.length; r++){
            if (nums[r] == nums[r-1]){
                continue;
            }
            
            if (nums[r] - nums[r-1] == 1){
                count++;
            }else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            
        }
        
        maxCount = Math.max(maxCount, count);
        
        return maxCount + 1;
    }
}




    
    