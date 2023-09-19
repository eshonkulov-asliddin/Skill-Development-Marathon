class Solution {
    public int largestAltitude(int[] gain) {
        /*
            Time Complexity: O(n)
            Space Complexity: (1)
        */
        
        int highestAltitude = 0;
        
        int altitude = highestAltitude;
        for (int curAltitude : gain) {
            altitude += curAltitude;
            highestAltitude = Math.max(highestAltitude, altitude);
        }
        
        return highestAltitude;
    }
}