class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int maxLeft = height[0];
        int maxRight = height[n-1];
        
        int l = 0;
        int r = n - 1;
        
        int count = 0;
        
        while (l <= r) {
            
            if (maxLeft <= maxRight) {
                
                int diff = maxLeft - height[l];
                if (diff > 0) {
                    count += diff;
                }
                
                maxLeft = Math.max(maxLeft, height[l]);
                l++;
            } else {
                int diff = maxRight - height[r];
                if (diff > 0) {
                    count+= diff;
                }
                
                maxRight = Math.max(maxRight, height[r]);
                r--;
            }
        }
        
        return count;
    }
}

