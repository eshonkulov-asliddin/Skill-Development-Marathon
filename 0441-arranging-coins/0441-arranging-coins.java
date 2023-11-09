class Solution {
    public int arrangeCoins(int n) {
        
        int count = 0;
        while (n > 0){
            if (n > count){
                count++;
            }
            n -= count;
        }
        
        return count;
        
    }
}

/*
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/