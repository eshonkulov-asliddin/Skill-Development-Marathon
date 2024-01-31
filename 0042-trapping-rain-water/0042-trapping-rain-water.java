class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        
        // fill maxLeft
        // first index always zero
        maxLeft[0] = 0;
        int curLeftMax = height[0];
        for (int i = 1; i < n; i++) {
            
            curLeftMax = Math.max(curLeftMax, height[i-1]);
            
            maxLeft[i] = curLeftMax;
        }
        
        
        // fill maxRight
        // last index always zero
        maxLeft[n - 1] = 0;
        int curRightMax = height[n - 1];
        for (int i = n-2; i >= 0; i--) {
            
            curRightMax = Math.max(curRightMax, height[i+1]);
            
            maxRight[i] = curRightMax;
        }
        
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            
            int currHeight = height[i];
            
            int tmp = Math.min(maxLeft[i], maxRight[i]);
            
            int diff = tmp - currHeight;
            if (diff > 0){
                count += diff;
            }
        }
        
        return count;
    }
}

