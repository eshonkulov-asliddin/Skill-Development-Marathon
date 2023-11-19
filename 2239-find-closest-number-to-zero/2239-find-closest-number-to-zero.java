class Solution {
    public int findClosestNumber(int[] nums) {
        int minDistance = Integer.MAX_VALUE;
        int largestNum = 0;
        
        for(int num : nums){
            int curDistance = Math.abs(num - 0);
            if(curDistance < minDistance ||
               (curDistance == minDistance && num > largestNum)){
                minDistance = curDistance;
                largestNum = num;
            }
        }
        
        return largestNum;
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/