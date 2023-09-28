class Solution {
    public int[] separateDigits(int[] nums) {
        
        List<Integer> allDigits = new ArrayList<>();
        
        for (int i = nums.length-1; i >= 0; i--){
            
            int curNum = nums[i];
            while (curNum != 0) {
                int remainder = curNum % 10;
                allDigits.add(remainder);
                curNum /= 10;
            }
        }
        
        Collections.reverse(allDigits);
        
        int listSize = allDigits.size();
        int[] ans = new int[listSize];
        
        for (int i = 0; i < listSize; i++){
            ans[i] = allDigits.get(i);
        }
        
        return ans;
        
    }
}

/*
    Time Complexity: O(n) n is the number of digits
    Space Complexity: O(n) n is the number of digits
*/