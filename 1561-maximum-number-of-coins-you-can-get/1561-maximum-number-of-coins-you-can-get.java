class Solution {
    /*
    
        [5,3,4]
        
        [1, 8, 9] = 8
        [2, 6, 7] = 6
                    4
        
        
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
            l              r
    */
    
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        
        int l = 0;
        int r = piles.length - 1;
        
        
        int coins = 0;
        while (l < r) {
            coins += piles[--r];
            
            r--;
            l++;
        }
        
        return coins;
        
    }
}