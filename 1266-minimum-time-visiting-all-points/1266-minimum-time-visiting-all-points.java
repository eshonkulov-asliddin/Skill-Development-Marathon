class Solution {
    
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int time = 0;
        
        for (int i = 1; i < points.length; i++) {
            
            int targetX = points[i][0];
            int targetY = points[i][1];
            
            int curX = points[i-1][0];
            int curY = points[i-1][1];
            
            time += Math.max(Math.abs(targetX - curX),
                             Math.abs(targetY - curY));
            
        }
        
        return time;
    }
}