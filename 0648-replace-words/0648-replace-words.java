class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Set<String> setOfRoot = new HashSet<>(dictionary);
        
        StringBuilder res = new StringBuilder();
        
        String[] splittedSentence = sentence.split(" ");
        
        
        for (String word : splittedSentence){
            
            StringBuilder curSubstring = new StringBuilder();
            boolean isFound = false;
            
            for (char letter : word.toCharArray()){
                
                curSubstring.append(letter);
                
                if (setOfRoot.contains(curSubstring.toString())){
                    res.append(curSubstring + " ");
                    isFound = true;
                    break;
                }
            }
            
            if (!isFound){
                res.append(word + " ");
            }
            
        }
        
        return res.toString().trim();
        
        
    }
        
}