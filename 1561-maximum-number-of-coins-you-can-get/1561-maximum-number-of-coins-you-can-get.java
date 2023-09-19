class Solution {
    /*
        Time Complexity: O(n log n) - because we are using sort()
        Space Complexity: O(1)
    */
    
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
      
        int length = piles.length;
        int r = length - 2;
        int coins = 0;
        for (int i = r; i >= length / 3; i -= 2) {
            coins += piles[i];
        }
        
        return coins;
        
    }
}