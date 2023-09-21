class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        Set<String> reversedSet = new HashSet<>();
        
        int count = 0;
        for (String word : words) {
            
            if (reversedSet.contains(word)) {
                count++;
                continue;
            }
            
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSet.add(reversedWord);
            
        }
        
        return count;
    }
    
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
}