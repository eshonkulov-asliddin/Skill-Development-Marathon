class Solution {
    
    /*
        Time Complexity: O(n2) -> worst case senario
        Space Complexity: O(1) -> if we don't count output array
        
    */
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int length = nums.length;
        
        int[] output = new int[length];
        
        for (int i = 0; i < length; i++) output[i] = -1; //fill arr with -1
        
        
        int pointer = 0;
        
        while (pointer < length ) {
            
            int idx = index[pointer];
            int num = nums[pointer];
            
            if (output[idx] == -1) {
                output[idx] = num;
                
            }else {
                
                int curIdx = idx;
                int curNum = output[idx];
                while (curIdx < length - 1 && output[curIdx + 1] != -1) {
                    int tmp = output[curIdx + 1];
                    output[curIdx + 1] = curNum;
                    curNum = tmp;
                    curIdx++;
                }

                output[curIdx + 1] = curNum;
                output[idx] = num;
            }
            
            pointer++;
            
            
        }
        
        return output;
        
        
        
        
    }
}