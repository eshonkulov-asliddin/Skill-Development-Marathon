class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        /*
            // Time Complexity: O(n)
            // Space Complexity: O(n)
        */
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) set.add(num);
        
        int count = 0;
        for (int num : nums) {
            
            int case1 = num - diff;
            int case2 = case1 - diff;
            
            if (set.contains(case1) && set.contains(case2)) count++;
        }
        
        return count;   
        
        
        /*
        
        // Time Complexity: O(n**2)
        // Space Complexity: O(1)
        
        int countTriplets = 0;
        
        for (int i = 0; i < nums.length-2; i++) {
            
            for (int j = i+1; j < nums.length-1; j++) {
                
                for (int k = j+1; k < nums.length; k++) {
                    
                    if (nums[j] - nums[i] == diff &&
                        nums[k] - nums[j] == diff){
                        countTriplets++;
                    }
                }
            }
        }
        
        return countTriplets;
        
        */
    }
}