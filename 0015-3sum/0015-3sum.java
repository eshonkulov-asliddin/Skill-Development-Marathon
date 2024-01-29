
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
                
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                        
                int curr = nums[i];
                int target = curr * (-1);

                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {
                    int currSum = nums[start] + nums[end];

                    if (currSum == target) {
                        res.add(List.of(curr, nums[start], nums[end]));

                        while (start < end && nums[start] == nums[start+1]){
                            start++;
                        }

                        while (start < end && nums[end] == nums[end-1]){
                            end--;
                        }
                        
                        start++;
                        end--;
                        
                    }else if (currSum > target) {
                        end--;
                    }else{
                        start++;
                    }
                }
            }
            
        }
        
        return res;
        
    }
}
