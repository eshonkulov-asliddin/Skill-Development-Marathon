class Solution {
    /* 
        Time Complexity: O(n*m) n-size of words, m-size of word withing words
        Space Complexity: O(n)
    
        
    */
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                                    "....","..",".---","-.-",".-..","--","-.",
                                    "---",".--.","--.-",".-.","...","-","..-",
                                    "...-",".--","-..-","-.--","--.."};
        
        int diff = 0;
        
        Set<String> occur = new HashSet<>();
        
        for (String word : words) {
            
            StringBuilder str = new StringBuilder();
            
            for (char ch : word.toCharArray()){
                
                int charToInt = (int) ch;
                int idx = charToInt - 97;
                String encodedChar = morseCode[idx];
                str.append(encodedChar);
            }
            
            
            boolean doContains = occur.contains(str.toString());
            
            if (!doContains){
                diff++;
                occur.add(str.toString());
            }
        }
        
        return diff;
        
    }
}