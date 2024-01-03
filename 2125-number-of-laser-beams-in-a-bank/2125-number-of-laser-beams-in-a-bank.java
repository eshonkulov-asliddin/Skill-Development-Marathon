class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int prev = getNumOfLazers(bank[0]);
        
        for (int i = 1; i < bank.length; i++) {
            int curr = getNumOfLazers(bank[i]);
            
            if (curr > 0) {
                result += (prev * curr);
                prev = curr;
            }
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