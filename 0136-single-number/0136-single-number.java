class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int l = 0, r = 1;
        
        while (r < nums.length){
            if (nums[l] != nums[r]){
                return nums[l];
            }
            
            l += 2;
            r += 2;
        }
        
        return nums[l];
        
    }
}