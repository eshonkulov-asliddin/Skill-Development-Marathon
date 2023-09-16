class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        
        for (int i = 0; i < l.length; i++){
            
            int start = l[i];
            int end = r[i];
            
            int[] subarray = Arrays.copyOfRange(nums, start, end+1);
            boolean check = isArithmetic(subarray);
            
            ans.add(check);
            
        }
        
        return ans;
        
    }
    
    public boolean isArithmetic(int[] nums) {
        
        Arrays.sort(nums);
        
        int diff = nums[0] - nums[1];
        
        return IntStream.range(2, nums.length)
            .allMatch(i -> nums[i-1] - nums[i] == diff);
        
    }
}