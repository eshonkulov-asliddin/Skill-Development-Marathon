/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        return (int) Arrays.stream(hours)
                            .filter(h -> (h >= target))
                            .count();
        
    }
}