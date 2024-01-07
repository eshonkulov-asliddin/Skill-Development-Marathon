class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preFixArr = getPreFixArr(nums);
        int[] postFixArr = getPostFixArr(nums);
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = preFixArr[i] * postFixArr[i];
        }
        
        return nums;
    }
    
    private int[] getPreFixArr(int[] nums) {
        int[] preFixArr = new int[nums.length];
        
        preFixArr[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            int preNum = nums[i-1];
            
            preFixArr[i] = preNum * preFixArr[i-1];
        }
        
        return preFixArr;
    }
    
    private int[] getPostFixArr(int[] nums) {
        int[] postFixArr = new int[nums.length];
        
        postFixArr[nums.length - 1] = 1;
        
        for (int i = nums.length - 2; i >=0; i--) {
            int postNum = nums[i+1];
            
            postFixArr[i] = postNum * postFixArr[i+1];
        } 
        
        return postFixArr;
    }
}

/*

nums = [1, 2, 3, 4]

preFix = [1, 1, 2, 6]
postFix = [24, 12, 4, 1]

nums = [-1, 1, 0, -3, 3]
               -
preFix = [1, -1, -1, 0, 0]
postFix= [0, 0, -9, 3, 1]

res =    [0, 0, 9, 0, 0]

*/