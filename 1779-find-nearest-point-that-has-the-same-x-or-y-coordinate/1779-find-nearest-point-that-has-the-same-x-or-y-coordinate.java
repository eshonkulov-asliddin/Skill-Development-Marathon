class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int minDistance = Integer.MAX_VALUE, minIdx = -1;
        
        int i = 0;
        for (int[] point : points){
            
            boolean isValidLocation = point[0] == x || point[1] == y;
            
            if (isValidLocation){
                int distance = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                if (distance < minDistance) {
                    minDistance = distance;
                    minIdx = i;
                }
            }
            
            
            i++;
        }
        
        return minIdx;
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/