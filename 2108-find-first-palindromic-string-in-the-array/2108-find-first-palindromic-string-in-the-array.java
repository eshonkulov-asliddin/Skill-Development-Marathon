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
        
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        
        return word.equals(reversedWord.toString());
        
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/