class Solution {
    public int largestAltitude(int[] gain) {
        
        int highestAltitude = 0;
        
        int altitude = highestAltitude;
        for (int curAltitude : gain) {
            altitude += curAltitude;
            highestAltitude = Math.max(highestAltitude, altitude);
        }
        
        return highestAltitude;
    }
}