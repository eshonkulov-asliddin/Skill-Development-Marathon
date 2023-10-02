class Solution {
    public int[] sumZero(int n) {
        
        boolean isOdd = n % 2 != 0;
        
        int[] ans = new int[n];
        
        int i = 0;
        
        if(isOdd){
            ans[i] = 0;
            i++;
        }
        
        int pos = 1;
        int neg = -1;
        
        while (i < n) {
            
            if (i % 2 == 0){
                ans[i] = pos++;
            }else{
                ans[i] = neg;
                neg--;
            }
            
            i++;
        }
        
        return ans;
        
    }
}