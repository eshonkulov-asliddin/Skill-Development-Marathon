class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            
            Map<Character, Character> wordPatternMap = new HashMap<>();
            Map<Character, Character> patternWordMap = new HashMap<>();
            int patternIdx = 0;
            boolean isValid = true;
            for (char letter : word.toCharArray()) {
                
                char patternLetter = pattern.charAt(patternIdx++);
                
                boolean isLetterExist = wordPatternMap.containsKey(letter);
                boolean isPatternLetterExist= patternWordMap.containsKey(patternLetter);
                
                if (isLetterExist && isPatternLetterExist) {
                    if (letter != patternWordMap.get(patternLetter)) {
                        isValid = false;
                        break;
                    }
                }else if (isLetterExist || isPatternLetterExist) {
                    isValid = false;
                    break;
                }
    
                
                wordPatternMap.put(letter, patternLetter);
                patternWordMap.put(patternLetter, letter);
            }
            
            if (isValid){
                ans.add(word);
                
            }
        }
        return ans;
    }
}