class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int maxLen = 0;
        int count = 0;
        
        for (int[] rectangle : rectangles) {
            
            int min = Math.min(rectangle[0], rectangle[1]);
            
            if (min > maxLen){
                maxLen = min;
                count = 1;
            }else if (min == maxLen){
                count++;
            }
        }
        
        return count;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/