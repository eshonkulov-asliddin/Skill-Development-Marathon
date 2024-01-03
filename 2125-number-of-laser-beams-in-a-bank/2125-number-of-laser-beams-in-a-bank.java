class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        
        int i = 0, j = 1;
        
        while (i < j && j < bank.length) {
            
            int first = getNumOfLazers(bank[i]);
            while (first <= 0 && j < bank.length - 1) {
                i++;
                j++;
                first = getNumOfLazers(bank[i]);
            }
            
            int second = getNumOfLazers(bank[j]);
            while (second <= 0 && j < bank.length - 1) {
                j++;
                second = getNumOfLazers(bank[j]);
            }
            
            result += (first * second);
            
            i = j;
            j++;
            
        }
        
        return result;
        
    }
    
    private int getNumOfLazers(String floor) {
        int count = 0;
        for (char ch : floor.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        
        return count;
    }
}