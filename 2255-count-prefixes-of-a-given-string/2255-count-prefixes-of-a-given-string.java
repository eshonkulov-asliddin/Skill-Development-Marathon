class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int count = 0;
        for(String prefix : words){
            count += isPrefix(prefix, s) ? 1 : 0;
        }
        
        return count;
        
    }
    
    public boolean isPrefix(String prefix, String word){
        int n = prefix.length(), m = word.length();
        
        int i = 0;
        while(i < n){
            if (i >= m ||
                prefix.charAt(i) != word.charAt(i)){
                return false;
            }
            i++;
        }
        
        return true;
    }
}

/*
    Time Complexity: O(n*m)
    Space Complexity: O(1)
*/