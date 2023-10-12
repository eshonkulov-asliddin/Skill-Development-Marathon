class Solution {
    public int[] numberOfPairs(int[] nums) {

        // base case
        if (nums.length == 1){
            return new int[]{0, 1};
        }

        int countPairs = 0;

        int length = nums.length;

        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j] && nums[i] != -1){
                    countPairs++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }

        return new int[]{countPairs, getRemainedNumLength(nums)};
        
    }

    public int getRemainedNumLength(int[] nums){
        int count = 0;
        for (int num : nums){
            if (num > -1){
                count++;
            }
        }
        return count;
    }
}

/*
    Time Complexity: O(n2)
    Space Complexity: O(1)
 */