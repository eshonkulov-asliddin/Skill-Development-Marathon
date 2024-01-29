class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;

        int l = 0;
        int r = height.length - 1;
        
        while (l < r) {
            
            int leftNum = height[l];
            int rightNum = height[r];
            
            int currArea = Math.min(leftNum, rightNum) * (r - l);
            
            maxArea = Math.max(maxArea, currArea);
            
            if (leftNum < rightNum){
                l++;
            }else{
                r--;
            }
        }
        
        return maxArea;
        
    }
}