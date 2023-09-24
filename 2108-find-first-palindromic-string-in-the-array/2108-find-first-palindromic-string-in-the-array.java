class Solution {
    public String firstPalindrome(String[] words) {
        
        for (String word : words) {
            
            if (isPalindrome(word)){
                return word;
            }
        }
        
        return "";
    }
    
    public boolean isPalindrome(String word) {
        
        int length = word.length();
        
        for (int i = 0; i < length / 2; i++) {
            
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                
                return false;
            }
            
        }
        return true;
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/