class Solution {
    public int balancedStringSplit(String s) {

        
        int tmp = 0, count = 0;
        for (char ch : s.toCharArray()){
            if (ch == 'R'){
                tmp++;
            }else{
                tmp--;
                
            }

            if (tmp == 0){
                count++;
            }
        }

        return count;
        
    }
}