class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        int count = 0;
        Map<String, Integer> freqWords1 = getFreq(words1);
        Map<String, Integer> freqWords2 = getFreq(words2);
        
        for (Map.Entry<String, Integer> entry : freqWords1.entrySet()){
            String key = entry.getKey();
            int occur = entry.getValue();
            
            boolean isKeyValid = freqWords2.containsKey(key);
            boolean isOccurValid = false;
            if (isKeyValid){
                isOccurValid = (occur == 1) && (freqWords2.get(key) == 1);
            }
            
            if (isKeyValid && isOccurValid){
                count++;
            }
        }
        
        return count;
        
    }
    
    public Map<String, Integer> getFreq(String[] words){
        Map<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        return map;
    }
}

/*
  Time Complexity: O(n)
  Space Complexity: O(n+m)

*/