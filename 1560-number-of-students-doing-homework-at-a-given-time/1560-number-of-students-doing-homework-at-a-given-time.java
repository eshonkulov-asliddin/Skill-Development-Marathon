class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        int length = startTime.length;
        int count = 0;
        
        for (int i = 0; i < length; i++) {
            
            if (startTime[i] <= queryTime && queryTime <= endTime[i]){
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